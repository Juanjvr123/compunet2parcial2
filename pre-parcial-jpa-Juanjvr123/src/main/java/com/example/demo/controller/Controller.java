package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Delivery;
import com.example.demo.model.Drone;
import com.example.demo.model.DroneEvent;
import com.example.demo.model.DronePosition;
import com.example.demo.repository.IDeliveryRepository;
import com.example.demo.repository.IDroneEventRepository;
import com.example.demo.repository.IDronePosition;
import com.example.demo.repository.IDroneRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/controller")
@RequiredArgsConstructor
public class Controller {
    private final IDroneRepository droneRepository;
    private final IDeliveryRepository deliveryRepository;
    private final IDronePosition dronePosition;
    private final IDroneEventRepository droneEventRepository;

    @GetMapping("/1")
    public List<Delivery> getCompletedDeliveriesByDroneCode() {
        String droneCode = "DRN-001";
        Drone drone = droneRepository.findByCode(droneCode);
        Long droneId = drone.getId();
        String status = "COMPLETED";
        return deliveryRepository.findAllByDrone_IdAndStatus(droneId, status);
    }

    @GetMapping("/2")
    public List<DronePosition> getDronePositionsByDroneCode() {
        String droneCode = "DRN-003";
        Drone drone = droneRepository.findByCode(droneCode);
        Long droneId = drone.getId();
        return dronePosition.findAllByDrone_IdOrderByRecordedAtDesc(droneId);
    }

    @GetMapping("/3")
    public DroneEvent getLastDroneEventByDeliveryId() {
        Long deliveryId = Long.parseLong("5");
        return droneEventRepository.findFirstByDelivery_IdOrderByEventTimeDesc(deliveryId);
    }

}
