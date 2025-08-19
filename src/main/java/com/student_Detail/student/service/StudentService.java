package com.student_Detail.student.service;

import com.student_Detail.student.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    Student createStudent(Student stud);

    List<Student> getStudents();
    Student getStudent(Long id);
}
