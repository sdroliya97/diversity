package com.blackrock.hack21.drise.service;

import com.blackrock.hack21.drise.dao.*;
import com.blackrock.hack21.drise.util.ObjectMapperProvider;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionService {
    public Question getQuestion(List<Question> allQuestions, Long id) {
        for (int i = 0; i < allQuestions.size(); i++) {
            if (allQuestions.get(i).id().equals(id)) {
                return allQuestions.get(i);
            }
        }
        return null;
    }
}
