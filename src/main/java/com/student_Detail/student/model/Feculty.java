package com.student_Detail.student.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Feculty {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long fucId;
    private String facName;
    private String facDept;
    private String facSalary;
    public Long getFucId() {
        return fucId;
    }

    public void setFucId(Long fucId) {
        this.fucId = fucId;
    }

    public String getFacName() {
        return facName;
    }

    public void setFacName(String facName) {
        this.facName = facName;
    }

    public String getFacDept() {
        return facDept;
    }

    public void setFacDept(String facDept) {
        this.facDept = facDept;
    }

    public String getFacSalary() {
        return facSalary;
    }

    public void setFacSalary(String facSalary) {
        this.facSalary = facSalary;
    }
}

