package com.student_Detail.student.service;

import org.springframework.stereotype.Service;

@Service
public class UserUtil {
    public String reverse(String str){
        return new StringBuilder(str).reverse().toString().toUpperCase();
    }
}
