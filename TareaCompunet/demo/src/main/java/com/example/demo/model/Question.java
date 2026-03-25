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
@Entity(name = "question")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @Column(name = "order_col")
    private Integer orderCol;

    @ManyToOne
    @JoinColumn(name = "section_id", nullable = false)
    private Section section;

    @ManyToOne
    @JoinColumn(name = "type", referencedColumnName = "name")
    private Type type;

    @OneToMany(mappedBy = "parentQuestion")
    @JsonIgnore
    @ToString.Exclude
    private List<Question> childQuestions;

    @ManyToOne
    @JoinColumn(name = "question_id", nullable = true)
    private Question parentQuestion;

    @OneToMany(mappedBy = "question")
    @JsonIgnore
    @ToString.Exclude
    private List<OptionQuestion> optionQuestions;

    @OneToMany(mappedBy = "question")
    @JsonIgnore
    @ToString.Exclude
    private List<Answer> answers;
}
