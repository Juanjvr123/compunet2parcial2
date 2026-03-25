package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Section;
import com.example.demo.repository.ISectionRepository;
import com.example.demo.service.ISectionService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SectionServiceImpl implements ISectionService {

    private final ISectionRepository sectionRepository;

    @Override
    public List<Section> getSurveyRootSectionsById(Integer id) {
        return sectionRepository.findBySurvey_IdAndParentSectionIsNull(id);
    }
}
