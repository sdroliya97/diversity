package com.blackrock.hack21.drise.service;
import java.util.Properties;

import com.blackrock.hack21.drise.dao.DiversityAnalysis;
import com.blackrock.hack21.drise.dao.DiversityResult;
import com.blackrock.hack21.drise.dao.ImmutableDiversityAnalysis;
import com.blackrock.hack21.drise.dao.ImmutableDiversityResult;
import org.ejml.simple.SimpleMatrix;

import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.neural.rnn.RNNCoreAnnotations;
import edu.stanford.nlp.pipeline.Annotation;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import edu.stanford.nlp.sentiment.SentimentCoreAnnotations;
import edu.stanford.nlp.trees.Tree;
import edu.stanford.nlp.util.CoreMap;
import org.springframework.stereotype.Service;

@Service
public class Analyzer {

    /*
     * "Very negative" = 0 "Negative" = 1 "Neutral" = 2 "Positive" = 3
     * "Very positive" = 4
     */

    static Properties props;
    static StanfordCoreNLP pipeline;

    public void initialize() {
        // creates a StanfordCoreNLP object, with POS tagging, lemmatization, NER, parsing, and sentiment
        props = new Properties();
        props.setProperty("annotators", "tokenize, ssplit, parse, sentiment");
        pipeline = new StanfordCoreNLP(props);
    }

    public DiversityResult getSentimentResult(String text) {
        DiversityResult diversityResult = null;
        if (text != null && text.length() > 0) {

            // run all Annotators on the text
            Annotation annotation = pipeline.process(text);
            for (CoreMap sentence : annotation.get(CoreAnnotations.SentencesAnnotation.class)) {
                // this is the parse tree of the current sentence
                Tree tree = sentence.get(SentimentCoreAnnotations.SentimentAnnotatedTree.class);
                SimpleMatrix sm = RNNCoreAnnotations.getPredictions(tree);
                String sentimentType = sentence.get(SentimentCoreAnnotations.SentimentClass.class);
                DiversityAnalysis diversityAnalysis = ImmutableDiversityAnalysis.builder()
                        .negative((double)(Math.round(sm.get(1) * 100d)))
                        .neutral((double)Math.round(sm.get(2) * 100d))
                        .positive((double)Math.round(sm.get(3) * 100d))
                        .veryNegative((double)Math.round(sm.get(0) * 100d))
                        .veryPositive((double)Math.round(sm.get(4) * 100d))
                        .build();

                diversityResult = ImmutableDiversityResult.builder()
                        .sentimentClass(diversityAnalysis)
                        .sentimentScore((double) RNNCoreAnnotations.getPredictedClass(tree))
                        .sentimentType(sentimentType)
                        .build();
            }

        }
        return diversityResult;
    }
}
