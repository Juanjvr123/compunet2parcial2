package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Answer;

public interface IAnswerService {
    List<Answer> getInterviewAnswersById(Integer id);

    List<Answer> getAnswersByQuestionId(Integer id);
}
