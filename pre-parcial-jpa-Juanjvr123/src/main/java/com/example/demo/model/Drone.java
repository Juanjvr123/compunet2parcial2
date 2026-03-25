package com.example.demo.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity(name = "drones")
@NoArgsConstructor
public class Drone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;

    private String name;

    private String status;

    @OneToMany(mappedBy = "drone")
    @JsonIgnore
    @ToString.Exclude
    private List<DronePosition> positions;

    @OneToMany(mappedBy = "drone")
    @JsonIgnore
    @ToString.Exclude
    private List<Delivery> deliveries;
}
