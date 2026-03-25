package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.DronePosition;

public interface IDronePosition extends JpaRepository<DronePosition, Long> {
    public List<DronePosition> findAllByDrone_IdOrderByRecordedAtDesc(Long id);
}
