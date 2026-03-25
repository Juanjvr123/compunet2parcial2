package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Section;

@Repository
public interface ISectionRepository extends JpaRepository<Section, Integer> {
    List<Section> findBySurvey_IdAndParentSectionIsNull(Integer id);
}
