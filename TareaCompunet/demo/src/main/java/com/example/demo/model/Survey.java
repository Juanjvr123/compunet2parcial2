package com.example.demo.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@Entity(name = "survey")
public class Survey {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String intro;
    private String validation;
    @Column(name = "image_url")
    private String imageUrl;
    private String outro;
    private String styles;

    @OneToMany(mappedBy = "survey")
    @JsonIgnore
    @ToString.Exclude
    private List<Section> sections;

    @OneToMany(mappedBy = "survey")
    @JsonIgnore
    @ToString.Exclude
    private List<Interview> interviews;
}
