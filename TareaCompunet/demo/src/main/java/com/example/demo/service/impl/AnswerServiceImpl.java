package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Answer;
import com.example.demo.repository.IAnswerRepository;
import com.example.demo.service.IAnswerService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AnswerServiceImpl implements IAnswerService {
    private final IAnswerRepository answerRepository;

    @Override
    public List<Answer> getInterviewAnswersById(Integer interviewId) {
        return answerRepository.findByInterview_Id(interviewId);
    }

    @Override
    public List<Answer> getAnswersByQuestionId(Integer id) {
        return answerRepository.findByQuestion_Id(id);
    }

}
