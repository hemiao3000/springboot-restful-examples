package com.example.springbootrestfulexample0.web;

import com.example.springbootrestfulexample0.entity.Department;
import org.springframework.web.bind.annotation.*;

@RestController
public class IndexController {

//    @GetMapping("/department")
    @RequestMapping(value = "/department/{id}", method = RequestMethod.GET)
    public Department findById(@PathVariable("id") Long id) {
        return null;
    }

//    @PostMapping("/department")
    @RequestMapping(value = "/department", method = RequestMethod.POST)
    public Department add(@RequestParam("name") String name, @RequestParam("location") String location) {
        return null;
    }

//    @PutMapping("/department")
    @RequestMapping(value = "/department", method = RequestMethod.PUT)
    public Department modify(@RequestParam("id") Long id, @RequestParam("name") String name, @RequestParam("location") String location) {
        return null;
    }

//    @DeleteMapping("/department")
    @RequestMapping(value = "/department/{id}", method = RequestMethod.DELETE)
    public Department deleteById(@PathVariable("id") Long id) {
        return null;
    }

}
