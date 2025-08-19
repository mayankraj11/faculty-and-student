package com.student_Detail.student.service.impl;

import com.student_Detail.student.model.Faculty;
import com.student_Detail.student.repository.FecultyRepository;
import com.student_Detail.student.service.FecultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacultyServiceImpl implements FecultyService {
    @Autowired
    private FecultyRepository FecultyRepository;
    public Faculty createFeculty(Faculty fuc){
        return FecultyRepository.save(fuc);
    }
    public List<Faculty> getFecultys(){
        return FecultyRepository.findAll();
    }
    public Faculty getFeculty(Long fucId){
        return FecultyRepository.findById(fucId).get();
    }
}
