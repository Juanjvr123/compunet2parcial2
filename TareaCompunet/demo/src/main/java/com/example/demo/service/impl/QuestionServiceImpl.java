package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Question;
import com.example.demo.repository.IQuestionRepository;
import com.example.demo.service.IQuestionService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class QuestionServiceImpl implements IQuestionService {
    public final IQuestionRepository questionRepository;

    @Override
    public List<Question> getSurveyQuestionsById(Integer id) {
        return questionRepository.findBySection_Survey_Id(id);
    }

    @Override
    public List<Question> getQuestionsByType(String type) {
        return questionRepository.findByType_Name(type);
    }

}
