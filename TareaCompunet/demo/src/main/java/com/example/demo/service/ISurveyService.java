package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Survey;

public interface ISurveyService {
    List<Survey> getSurveysSectionsQuestions();

    List<Survey> getSurveysByNameLike(String nameLike);

    List<Survey> getAll();
}
