package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Section;

public interface ISectionService {
    List<Section> getSurveyRootSectionsById(Integer id);
}
