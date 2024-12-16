package com.example.demo.controller;

@RestController
public class StudentController {

    @GetMapping("/some-method")
    public void someMethod(){
        
    }

    @PostMapping("/get-string")
    public String getString(){
        return "string";
    }

}
