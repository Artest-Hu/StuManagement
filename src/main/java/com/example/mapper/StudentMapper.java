package com.example.mapper;

import com.example.DTO.StudentDTO;
import com.example.entity.Student;

public class StudentMapper {
    public static StudentDTO maptoStudentDTO(Student student) {
        return new StudentDTO(
                student.getId(),
                student.getFirstName(),
                student.getLastName(),
                student.getEmail(),
                student.getCourses() //MTM
        );
    }

    public static Student maptoStudent(StudentDTO studentDTO) {
        return new Student(
                studentDTO.getId(),
                studentDTO.getFirstName(),
                studentDTO.getLastName(),
                studentDTO.getEmail(),
                studentDTO.getCourses() //MTM
        );
    }
}
