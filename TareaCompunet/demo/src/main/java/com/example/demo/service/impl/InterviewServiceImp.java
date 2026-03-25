package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.model.Interview;
import com.example.demo.model.Survey;
import com.example.demo.repository.IInterviewRepository;
import com.example.demo.service.IInterviewService;
import com.example.demo.service.ISurveyService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class InterviewServiceImp implements IInterviewService {
    private final IInterviewRepository interviewRepostiory;
    private final ISurveyService surveyService;

    @Override
    public Optional<Interview> getFirstInterviewBySurveyId(Integer id) {
        return interviewRepostiory.findFirstBySurvey_IdOrderByTimeStartAsc(id);
    }

    @Override
    public boolean existsInterviewsByInterviewerId(Integer id) {
        return interviewRepostiory.existsByInterviewerId(id);
    }

    @Override
    public List<Interview> getInterviewsWithAnswersBySurveyId(Integer id) {
        return interviewRepostiory.findBySurvey_IdOrderByTimeStartAsc(id);
    }

    @Override
    public String getNumberOfInterviewsForEachSurvey() {
        List<Survey> surveys = surveyService.getAll();
        StringBuilder result = new StringBuilder();
        for (Survey survey : surveys) {
            Integer id = survey.getId();
            long times = interviewRepostiory.countBySurvey_Id(id);
            result.append("Survey Id: ");
            result.append(id);
            result.append(" Survey Name: ");
            result.append(survey.getName());
            result.append(" Number of Interviews: ");
            result.append(times);
            result.append("\n");
        }

        return result.toString();
    }
}
