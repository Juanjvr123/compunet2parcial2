package com.example.demo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Option;
import com.example.demo.model.OptionQuestion;
import com.example.demo.repository.IOptionQuestionRepository;
import com.example.demo.service.IOptionQuestionService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OptionQuestionService implements IOptionQuestionService {
    private final IOptionQuestionRepository optionQuestionRepository;

    @Override
    public List<Option> getOptionsByQuestionId(Integer id) {
        List<OptionQuestion> optionQuestions = optionQuestionRepository.findByQuestion_Id(id);
        List<Option> options = new ArrayList<Option>();
        for (OptionQuestion optionQuestion : optionQuestions) {
            options.add(optionQuestion.getOption());
        }
        return options;
    }
}
