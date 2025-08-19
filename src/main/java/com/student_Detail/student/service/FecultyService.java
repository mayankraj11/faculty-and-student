package com.student_Detail.student.service;

import com.student_Detail.student.model.Faculty;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FecultyService {
    Faculty createFeculty(Faculty fuc);
    List<Faculty> getFecultys();
    Faculty getFeculty(Long fucId);
}
