package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Answer;
import com.example.demo.model.Interview;
import com.example.demo.model.Option;
import com.example.demo.model.Question;
import com.example.demo.model.Section;
import com.example.demo.model.Survey;
import com.example.demo.service.IAnswerService;
import com.example.demo.service.IInterviewService;
import com.example.demo.service.IOptionQuestionService;
import com.example.demo.service.IOptionService;
import com.example.demo.service.IQuestionService;
import com.example.demo.service.ISectionService;
import com.example.demo.service.ISurveyService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/controller")
@RequiredArgsConstructor
public class Controller {

    private final ISurveyService surveyService;
    private final IInterviewService interviewService;
    private final IQuestionService questionService;
    private final IAnswerService answerService;
    private final IOptionService optionService;
    private final IOptionQuestionService optionQuestionService;
    private final ISectionService sectionService;

    // 1
    @GetMapping("/1")
    public List<Survey> getAllSurveysSectionsQuestions() {
        return surveyService.getSurveysSectionsQuestions();
    }

    // 2
    @GetMapping("/2")
    public List<Answer> getInterviewAnswers() {
        Integer interviewId = 22;
        return answerService.getInterviewAnswersById(interviewId);
    }

    // 3
    @GetMapping("/3")
    public List<Option> getOptionsByQuestion() {
        Integer questionId = 77;
        return optionQuestionService.getOptionsByQuestionId(questionId);
    }

    // 4
    @GetMapping("/4")
    public List<Question> getSurveyQuestions() {
        Integer surveyId = 56;
        return questionService.getSurveyQuestionsById(surveyId);
    }

    // 5
    @GetMapping("/5")
    public List<Interview> getSurveyResults() {
        Integer surveyId = 234;
        return interviewService.getInterviewsWithAnswersBySurveyId(surveyId);
    }

    // 6
    @GetMapping("/6")
    public List<Question> getTypeQuestions() {
        String type = "Economicas";
        return questionService.getQuestionsByType(type);
    }

    // 7
    @GetMapping("/7")
    public List<Survey> getSurveysByName() {
        String surveyNameLike = "encuesta";
        return surveyService.getSurveysByNameLike(surveyNameLike);
    }

    // 8
    @GetMapping("/8")
    public List<Answer> getAllInterviewQuestionAnswers() {
        Integer questionId = 98;
        return answerService.getAnswersByQuestionId(questionId);
    }

    // 9
    @GetMapping("/9")
    public List<Section> getSurveyRootSections() {
        Integer surveyId = 39;
        return sectionService.getSurveyRootSectionsById(surveyId);
    }

    // 10
    @GetMapping("/10")
    public List<Option> getOptionsByGroup() {
        Integer groupId = 44;
        return optionService.getOptionsByGroupId(groupId);
    }

    // 11 same logic as 3, at three we are accessing to the question options by the
    // intermediate table, OptionQuestion
    // @GetMapping
    // public List<Option> getOptionsByQuestion() {
    // Integer questionId = 77;
    // return optionQuestionService.getOptionsByQuestionId(questionId);
    // }

    // 12
    @GetMapping("/12")
    public Optional<Interview> getFirstInterviewBySurvey() {
        Integer surveyId = 20;
        return interviewService.getFirstInterviewBySurveyId(surveyId);

    }

    // 13
    @GetMapping("/13")
    public String getNumberOfInterviewsForEachSurvey() {
        return interviewService.getNumberOfInterviewsForEachSurvey();
    }

    // 14
    @GetMapping("/14")
    public boolean existsInterviewsByInterviewer() {
        Integer interviewerId = 111;
        return interviewService.existsInterviewsByInterviewerId(interviewerId);
    }

    // 15 Same as 6
    // @GetMapping
    // public List<Question> getTypeQuestions() {
    // String type = "Economicas";
    // return questionService.getQuestionsByType(type);
    // }

}
