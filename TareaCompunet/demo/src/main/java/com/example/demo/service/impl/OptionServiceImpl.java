package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Option;
import com.example.demo.repository.IOptionRepository;
import com.example.demo.service.IOptionService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OptionServiceImpl implements IOptionService {
    private final IOptionRepository optionRepository;

    @Override
    public List<Option> getOptionsByGroupId(Integer id) {
        return optionRepository.findByOptionGroup_Id(id);
    }
}
