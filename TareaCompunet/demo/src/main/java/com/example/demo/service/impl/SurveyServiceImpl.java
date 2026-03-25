package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Survey;
import com.example.demo.repository.ISurveyRepository;
import com.example.demo.service.ISurveyService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SurveyServiceImpl implements ISurveyService {

    private final ISurveyRepository surveyRepository;

    @Override
    public List<Survey> getSurveysSectionsQuestions() {
        return surveyRepository.findAll();
    }

    @Override
    public List<Survey> getSurveysByNameLike(String nameLike) {
        return surveyRepository.findByNameContainingIgnoreCase(nameLike);
    }

    @Override
    public List<Survey> getAll() {
        return surveyRepository.findAll();
    }

}
