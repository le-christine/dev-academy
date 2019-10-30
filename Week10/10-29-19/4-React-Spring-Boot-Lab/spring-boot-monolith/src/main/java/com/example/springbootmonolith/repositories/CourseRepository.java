package com.example.springbootmonolith.repositories;

import com.example.springbootmonolith.models.Course;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Integer> {
    @Query("FROM Course c WHERE c.code=?1")
    Course findByCode(String code);
}
