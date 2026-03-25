package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Interview;

@Repository
public interface IInterviewRepository extends JpaRepository<Interview, Integer> {
    Optional<Interview> findFirstBySurvey_IdOrderByTimeStartAsc(Integer id);

    boolean existsByInterviewerId(Integer id);

    @EntityGraph(attributePaths = { "answers" })
    List<Interview> findBySurvey_IdOrderByTimeStartAsc(Integer id);

    long countBySurvey_Id(Integer id);
}
