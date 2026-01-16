package com.example.mapper;

import com.example.DTO.CourseDTO;
import com.example.entity.Course;

public class CourseMapper {
    public static CourseDTO maptoCourseDTO(Course course) {
        return new CourseDTO(
                course.getId(),
                course.getCourseName()
        );
    }

    public static Course maptoCourse(CourseDTO courseDTO) {
        return new Course(
                courseDTO.getId(),
                courseDTO.getCourseName()
        );
    }
}
