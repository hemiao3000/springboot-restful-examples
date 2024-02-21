package com.example.springbootrestfulexample2.web;

import com.example.springbootrestfulexample2.entity.Department;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping("/department/{id}")
    public Department getDepartment(@PathVariable("id") Long id) {
        return new Department(id, "hello", "world");
    }
}
