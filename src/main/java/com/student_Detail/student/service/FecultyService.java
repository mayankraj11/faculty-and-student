package com.student_Detail.student.service;

import com.student_Detail.student.model.Feculty;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FecultyService {
    Feculty createFeculty(Feculty fuc);
    List<Feculty> getFecultys();
    Feculty getFeculty(Long fucId);
}
