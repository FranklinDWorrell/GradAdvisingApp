package com.github.FranklinDWorrell.managers.impl;

import com.github.FranklinDWorrell.domain.Course;
import com.github.FranklinDWorrell.managers.ICourseManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.github.FranklinDWorrell.repositories.ICourseRepository;

import java.util.List;

@Component
public class CourseManager implements ICourseManager {

    ICourseRepository courseRepository;

    public CourseManager(ICourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public Course getCourseByCourseNumber(String courseNumber) {
        return courseRepository.findOne(courseNumber);
    }

    @Override
    public Course addCourseToCatalog(Course course) {
        return courseRepository.save(course);
    }

}
