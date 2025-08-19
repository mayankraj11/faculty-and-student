package com.student_Detail.student.service.impl;

import com.student_Detail.student.model.Student;
import com.student_Detail.student.repository.StudentRepository;
import com.student_Detail.student.service.StudentService;
import com.student_Detail.student.service.UserUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
   public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository StudentRepository;

    @Autowired
    private UserUtil util;

    public Student createStudent(Student stud) {
        String actualName=stud.getStudentName();
        String reverseName= util.reverse(actualName);
        stud.setStudentName(reverseName);
        return StudentRepository.save(stud);
    }
    public List<Student> getStudents(){
        return StudentRepository.findAll();
    }
    public Student getStudent(Long id){
        return StudentRepository.findById(id).get();
    }
}
