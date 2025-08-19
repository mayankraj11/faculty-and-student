package com.student_Detail.student.controller;

import com.student_Detail.student.model.Feculty;
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
    public Feculty createFeculty(@RequestBody Feculty fuc){
        System.out.println("Feculty"+fuc.getFacName());
        return FecultyService.createFeculty(fuc);
    }
    @GetMapping("/")
    public List<Feculty> getFecultys(){
        return FecultyService.getFecultys();
    }
    @GetMapping("/{fucId}")
    public Feculty getFeculty(Long fucId){
        return (Feculty) FecultyService.getFeculty(fucId);
    }
}
