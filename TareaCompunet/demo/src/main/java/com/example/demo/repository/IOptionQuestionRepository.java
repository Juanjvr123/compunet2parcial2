package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.OptionQuestion;

@Repository
public interface IOptionQuestionRepository extends JpaRepository<OptionQuestion, Integer> {
    List<OptionQuestion> findByQuestion_Id(Integer id);
}
