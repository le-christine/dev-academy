package com.example.springbootmonolith.service;

import com.example.springbootmonolith.models.Course;

public interface CourseService {

    public Course createCourse(Course course);

    public Iterable<Course> listCourses();

    public Course findByCode(String code);

    public Course save(Course course);

    void deleteByCode(String code);
}
