package com.github.FranklinDWorrell.repositories;

import com.github.FranklinDWorrell.domain.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICourseRepository extends JpaRepository<Course, String> {
    // No special methods needed.
}
