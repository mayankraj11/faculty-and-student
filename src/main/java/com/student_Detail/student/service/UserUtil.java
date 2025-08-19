package com.student_Detail.student.service;

import org.springframework.stereotype.Service;

@Service
public class UserUtil {
    public String reverse(String str){
        //write a code to reverse the str
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        String rev=sb.toString();
        String caps=rev.toUpperCase();
        return caps;
    }
}
