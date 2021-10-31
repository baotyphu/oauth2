package com.example.authorizationkeycloak.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @Autowired
    private CourseService couseService;

    @GetMapping(value = "/courses")
    public void getCourse() throws JsonProcessingException {
        System.out.println("sdfsd");
    }
    @GetMapping(value = "/courses/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Course getCourse(@PathVariable("id") long id, Model model) throws JsonProcessingException {
        Course course = couseService.getCourse(id);
        return course;
    }

    @DeleteMapping("/courses/{id}")
    public void deleteStudent(@PathVariable long id) {
        System.out.println("calling delete operation");
        couseService.deleteById(id);
    }
}
