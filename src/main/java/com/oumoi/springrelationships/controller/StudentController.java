package com.oumoi.springrelationships.controller;


import com.oumoi.springrelationships.entity.Student;
import com.oumoi.springrelationships.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {


    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/students")
    public List<Student> studentList(){
        return studentRepository.findAll();
    }


    @PostMapping("/students")
    public Student addStudent(@ModelAttribute Student student){
        return studentRepository.save(student);
    }
}
