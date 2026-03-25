package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Question;

public interface IQuestionService {
    List<Question> getSurveyQuestionsById(Integer id);

    List<Question> getQuestionsByType(String type);

}
