package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Delivery;

public interface IDeliveryRepository extends JpaRepository<Delivery, Long> {
    public List<Delivery> findAllByDrone_IdAndStatus(Long id, String status);
}
