package com.example.springdataJPA_manytomany;

import com.example.springdataJPA_manytomany.Repository.CourseRepository;
import com.example.springdataJPA_manytomany.Repository.StudentRepository;
import com.example.springdataJPA_manytomany.model.Course;
import com.example.springdataJPA_manytomany.model.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringJPAManyToManyApp {

    public static void main(String[] args) {
        SpringApplication.run(SpringJPAManyToManyApp.class, args);


    }


}
