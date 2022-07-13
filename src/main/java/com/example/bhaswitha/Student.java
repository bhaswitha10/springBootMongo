package com.example.bhaswitha;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document (collection = "student")
public class Student {
    @Id
    private String id;
    private int rollNum;
    private String firstName;
    private String lastName;
    private String email;
    private String gender;
    private int grade;
    private double percent;

    public Student(int rollNum, 
                String firstName, 
                String lastName, 
                String email, 
                String gender, 
                int grade, 
                double d){
            
            this.rollNum = rollNum;
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
            this.grade = grade;
            this.gender = gender;
            this.percent = d;       

    }
}
