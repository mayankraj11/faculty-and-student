package com.student_Detail.student.controller;

import com.student_Detail.student.model.Student;
import com.student_Detail.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stud")
public class StudController {
    @Autowired
    private StudentService studentService;
    @PostMapping("/")
    public Student createStudent(@RequestBody Student stud){
        System.out.println("Student"+stud.getStudentName());
        return studentService.createStudent(stud);
    }
    @GetMapping("/")
    public List<Student> getStudents(){
      return  studentService.getStudents();
    }
    @GetMapping("/{id}")
    public Student getstudent(@PathVariable("id") Long id){
        return (Student) studentService.getStudent(id);
    }

}
