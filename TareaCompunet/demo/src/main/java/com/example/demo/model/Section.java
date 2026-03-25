package com.example.demo.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@Entity(name = "section")
public class Section {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String description;
    private String flag;
    @Column(name = "order_col")
    private Integer orderCol;
    private String type;
    @Column(name = "background_image")
    private String backgroundImage;

    @OneToMany(mappedBy = "parentSection")
    @JsonIgnore
    @ToString.Exclude
    private List<Section> childSections;

    @ManyToOne
    @JoinColumn(name = "section_id", nullable = true)
    private Section parentSection;

    @ManyToOne
    @JoinColumn(name = "survey_id")
    private Survey survey;

    @OneToMany(mappedBy = "section")
    @JsonIgnore
    @ToString.Exclude
    private List<Question> questions;
}
