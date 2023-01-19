package com.blackrock.hack21.drise.service;

import com.blackrock.hack21.drise.dao.ImmutableTextAnalyzerResponse;
import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.Annotation;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import edu.stanford.nlp.process.Morphology;
import edu.stanford.nlp.trees.TreeTransformer;
import edu.stanford.nlp.trees.WordStemmer;
import edu.stanford.nlp.util.CoreMap;

import java.io.IOException;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class TextAnalyticsService {

    private static List<String> stopWords;
    private static StanfordCoreNLP pipeline;
    private static WordStemmer stemmer;
    private static Pattern alphaNumericPattern = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
    private static TreeTransformer treeTransformer = tree -> {
        stemmer.visitTree(tree);
        return tree;
    };
    private static Predicate<String> isStopWord = word -> stopWords.indexOf(word) == -1;
    private static Function<CoreLabel, String> convertLabelToString = label -> label.value();
    private static Predicate<String> isAlphaNumeric = word -> !alphaNumericPattern.matcher(word).matches();
    private static Function<String, String> stemmer2 = word -> new Morphology().lemma(word, "VP");
    //private static String path = TextAnalyticsService.class.getProtectionDomain().getCodeSource().getLocation().getPath();
    private static List<String> dictionary;
    private static Predicate<String> isWordPresentInDictionary = word -> dictionary.indexOf(word) != -1;

    static {
        stopWords = Arrays.asList("a", "an", "and", "are", "as", "at", "be", "but", "by", "for", "if", "in", "into", "is", "it", "no", "not", "of", "on", "or", "such", "that", "the", "their", "then", "there", "these", "they", "this", "to", "was", "will", "with");
        Properties props = new Properties();
        props.setProperty("annotators", "tokenize, ssplit, pos, parse, sentiment");
        pipeline = new StanfordCoreNLP(props);
        stemmer = new WordStemmer();
        try {
            String dictionaryText = new String(TextAnalyticsService.class.getResourceAsStream("/dictionary.txt").readAllBytes());
            dictionary = Arrays.stream(dictionaryText.split(",")).map(stemmer2).collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ImmutableTextAnalyzerResponse analyse(String line) throws IOException {
        Set<String> setOfProblematicWords = new HashSet<>();
        long totalWords = 0;
        if (line != null && line.length() > 0) {

            Annotation annotation = pipeline.process(line);
            for (CoreMap sentence : annotation.get(CoreAnnotations.SentencesAnnotation.class)) {
                Set<String> collect = sentence.get(CoreAnnotations.TokensAnnotation.class)
                        .stream().map(convertLabelToString)
                        .filter(isAlphaNumeric)
                        .filter(isStopWord)
                        .map(stemmer2)
                        .collect(Collectors.toSet());

                totalWords += collect.size();

                collect = collect.stream().filter(isWordPresentInDictionary)
                        .collect(Collectors.toSet());

                setOfProblematicWords.addAll(collect);
            }
        }
        double score = (double) setOfProblematicWords.size() / (double) totalWords;
        System.out.println(score + " " + setOfProblematicWords.size() + " " + totalWords);
        return ImmutableTextAnalyzerResponse.builder()
                .addAllBiasWords(setOfProblematicWords)
                .biasScore(score * 100)
                .build();
    }

    public static void main(String[] args) throws IOException {
        new TextAnalyticsService().analyse("In order to set a direction, create alignment, and generate commitment to DEI, top organizational leaders take the first steps: articulate their individual and collective perspective, identity, values, and culture; consider how experiences of power and privilege may affect their approach and effectiveness — and that of others; and evaluate how dynamics of DEI affect their marketplace and their business strategy. Flying flew flew cripple.");
//        new TextAnalyticsService().analyse("Flying flew");
    }
}
