package com.github.FranklinDWorrell.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@EqualsAndHashCode
@Entity
@Table(name = "courses")
public class Course {

    @Id
    @Column(name = "course_number")
    private String courseNumber;

    @Column(name = "course_title")
    private String courseTitle;

    @Column(name = "course_description")
    private String courseDescription;

}
