package com.example.bhaswitha.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.bhaswitha.Student;
import com.example.bhaswitha.StudentRepository;

@Controller("/api")
public class StudentResource {
    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/students")
    private List<Student> getAllStudents(){
        List<Student> studentsList = studentRepository.findAll();
        return studentsList;
    }

    
}
