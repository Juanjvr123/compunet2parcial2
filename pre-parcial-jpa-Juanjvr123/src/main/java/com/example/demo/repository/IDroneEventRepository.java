package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.DroneEvent;

public interface IDroneEventRepository extends JpaRepository<DroneEvent, Long> {
    public DroneEvent findFirstByDelivery_IdOrderByEventTimeDesc(Long id);
}
