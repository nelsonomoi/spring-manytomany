package com.oumoi.springrelationships.controller;

import com.oumoi.springrelationships.entity.Student;
import com.oumoi.springrelationships.entity.Subject;
import com.oumoi.springrelationships.repository.StudentRepository;
import com.oumoi.springrelationships.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class SubjectController {

    @Autowired
    private SubjectRepository subjectRepository;

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/subjects")
    public List<Subject> subjects(){
        return subjectRepository.findAll();
    }


    @PostMapping("/subjects")
    public Subject addSubject(@ModelAttribute Subject subject){
        return subjectRepository.save(subject);
    }

    @PostMapping("/student/{student_id}/subject/{subject_id}")
    public Subject enrollStudent(
            @PathVariable Long student_id,
            @PathVariable Long subject_id
    ){
        Subject subject =  subjectRepository.findById(subject_id).get();
        Student student =  studentRepository.findById(student_id).get();

        subject.enrollStudent(student);

        return subjectRepository.save(subject);
    }
}
