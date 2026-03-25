package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Interview;

public interface IInterviewService {
    Optional<Interview> getFirstInterviewBySurveyId(Integer id);

    boolean existsInterviewsByInterviewerId(Integer id);

    List<Interview> getInterviewsWithAnswersBySurveyId(Integer id);

    String getNumberOfInterviewsForEachSurvey();
}
