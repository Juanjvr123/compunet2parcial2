package com.example.demo.model;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity(name = "deliveries")
@NoArgsConstructor
public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tracking_code")
    private String trackingCode;

    private String status;

    private String destination;

    @Column(name = "assigned_at")
    private Timestamp assignedAt;

    @ManyToOne
    @JoinColumn(name = "drone_id", nullable = false)
    @JsonIgnore
    @ToString.Exclude
    private Drone drone;

}
