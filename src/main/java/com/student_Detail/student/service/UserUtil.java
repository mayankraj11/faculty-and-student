package com.student_Detail.student.service;

import org.springframework.stereotype.Service;

@Service
public class UserUtil {
    /**
     * This method reverses the input string and converts it to uppercase.
     *
     * @param str the input string to be reversed
     * @return the reversed string in uppercase
     */
    public String reverse(String str){
        System.out.println("UserUtil class is created");
        return new StringBuilder(str).reverse().toString().toUpperCase();
    }
}
