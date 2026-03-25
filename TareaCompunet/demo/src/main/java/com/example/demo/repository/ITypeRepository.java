package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Type;

@Repository
public interface ITypeRepository extends JpaRepository<Type, Integer> {
    List<Type> findAll();
}
