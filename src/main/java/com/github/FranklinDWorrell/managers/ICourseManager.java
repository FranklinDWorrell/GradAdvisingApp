package com.github.FranklinDWorrell.managers;

import com.github.FranklinDWorrell.domain.Course;

import java.util.List;

public interface ICourseManager {

    List<Course> getAllCourses();

    Course getCourseByCourseNumber(String courseNumber);

    Course addCourseToCatalog(Course course);

}
