package com.example.controller;

import com.example.DTO.CourseDTO;
import com.example.service.CourseService;
import com.example.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/courses")
public class CourseController {

    @Autowired
    private CourseService courseService;
    //Build Add Course REST API
    @PostMapping
    public ResponseEntity<CourseDTO> createCourse(@RequestBody CourseDTO courseDto){
        CourseDTO savedCourse = courseService.createCourse(courseDto);
        return new ResponseEntity<>(savedCourse, HttpStatus.CREATED);
    }

    //Build Get Course by ID REST API
    @GetMapping("/{id}")
    public ResponseEntity<CourseDTO> getCourseById(@PathVariable("id") Long courseId){
        CourseDTO courseDto = courseService.getCourseById(courseId);
        return ResponseEntity.ok(courseDto);
    }

    //Build Get All Courses REST API
    @GetMapping
    public ResponseEntity<List<CourseDTO>> getAllCourses(){
        List<CourseDTO> courses = courseService.getAllCourses();
        return ResponseEntity.ok(courses);
    }

    //Build Update Course REST API
    @PutMapping("/{id}")
    public ResponseEntity<CourseDTO> updateCourse(@PathVariable("id") Long courseId, @RequestBody CourseDTO updatedCourse) {
        CourseDTO courseDto = courseService.updateCourse(courseId, updatedCourse);
        return ResponseEntity.ok(updatedCourse);
    }

    //Build Delete Course REST API
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCourse(@PathVariable("id") Long courseId){
        courseService.deleteCourse(courseId);
        return ResponseEntity.ok("Course deleted successfully");

    }

}
