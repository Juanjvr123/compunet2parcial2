package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Survey;

@Repository
public interface ISurveyRepository extends JpaRepository<Survey, Integer> {

    @EntityGraph(attributePaths = { "sections", "sections.questions" })
    List<Survey> findAll();

    List<Survey> findByNameContainingIgnoreCase(String name);
}
