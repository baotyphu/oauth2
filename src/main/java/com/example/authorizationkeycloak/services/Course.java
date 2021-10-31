package com.example.authorizationkeycloak.services;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Course {

    private static long nextID = 1000;


    public Course(String code, String name, String modules, String enrollmentTerm) {
        super();
        this.id = nextID++;
        this.code = code;
        this.name = name;
        this.modules = modules;
        this.enrollmentTerm = enrollmentTerm;
    }
    Long id;
    String code;
    String name;
    String modules;
    String enrollmentTerm;
}
