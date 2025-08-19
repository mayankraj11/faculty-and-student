package com.student_Detail.student.controller;

import com.student_Detail.student.model.Faculty;
import com.student_Detail.student.service.FecultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fuc")
public class fucController {
    @Autowired
    private FecultyService FecultyService;
    @PostMapping("/")
    public Faculty createFeculty(@RequestBody Faculty fuc){
        System.out.println("Feculty"+fuc.getFacName());
        return FecultyService.createFeculty(fuc);
    }
    @GetMapping("/")
    public List<Faculty> getFecultys(){
        return FecultyService.getFecultys();
    }
    @GetMapping("/{fucId}")
    public Faculty getFeculty(Long fucId){
        return (Faculty) FecultyService.getFeculty(fucId);
    }
}
