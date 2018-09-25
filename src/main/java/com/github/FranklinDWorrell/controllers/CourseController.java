package com.github.FranklinDWorrell.controllers;

import com.github.FranklinDWorrell.domain.Course;
import com.github.FranklinDWorrell.managers.ICourseManager;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/course")
public class CourseController {

    private ICourseManager courseManager;

    public CourseController(ICourseManager courseManager) {
        this.courseManager = courseManager;
    }

    @RequestMapping(method = RequestMethod.POST)
    public Course addCourseToCatalog(@RequestBody Course course) {
        return courseManager.addCourseToCatalog(course);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Course> getAllCourses() {
        return courseManager.getAllCourses();
    }

    @RequestMapping(value = "/{courseNumber}", method = RequestMethod.GET)
    public Course getCourseByCourseNumber(@PathVariable String courseNumber) {
        return courseManager.getCourseByCourseNumber(courseNumber);
    }

}
