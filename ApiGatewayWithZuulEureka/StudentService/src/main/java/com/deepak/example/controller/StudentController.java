package com.deepak.example.controller;

import java.util.ArrayList;
import java.util.List;

import com.deepak.example.model.StudentModel;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    @GetMapping(value = "/getStudentDetails")
    public List<StudentModel> getStudentDetails() {
        List<StudentModel> studentList = new ArrayList<>();
        studentList.add(new StudentModel(1, "Deepak", "Patna"));
        studentList.add(new StudentModel(2, "Ashif", "Begusarai"));
        studentList.add(new StudentModel(3, "Nitish", "Saharsa"));
        studentList.add(new StudentModel(4, "Nimi", "Balia"));
        return studentList;
    }

    
}