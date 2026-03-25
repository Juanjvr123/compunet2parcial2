package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Option;

public interface IOptionQuestionService {
    List<Option> getOptionsByQuestionId(Integer id);
}
