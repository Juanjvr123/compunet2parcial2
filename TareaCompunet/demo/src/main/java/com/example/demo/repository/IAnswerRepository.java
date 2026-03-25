package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Answer;

@Repository
public interface IAnswerRepository extends JpaRepository<Answer, Integer> {
    List<Answer> findByInterview_Id(Integer id);

    List<Answer> findByQuestion_Id(Integer id);
}
