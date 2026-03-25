package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Option;

@Repository
public interface IOptionRepository extends JpaRepository<Option, Integer> {
    List<Option> findByOptionGroup_Id(Integer id);
}
