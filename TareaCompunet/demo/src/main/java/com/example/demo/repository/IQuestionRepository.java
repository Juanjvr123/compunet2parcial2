package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Question;

@Repository
public interface IQuestionRepository extends JpaRepository<Question, Integer> {
    List<Question> findBySection_Survey_Id(Integer id);

    List<Question> findByType_Name(String type);
}
