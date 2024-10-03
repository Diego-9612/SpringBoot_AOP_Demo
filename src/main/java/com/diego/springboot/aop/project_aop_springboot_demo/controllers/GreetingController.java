package com.diego.springboot.aop.project_aop_springboot_demo.controllers;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diego.springboot.aop.project_aop_springboot_demo.services.GreetingService;

@RestController
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    @GetMapping("/greeting")
    public ResponseEntity<?> greeting (){
        return ResponseEntity.ok(Collections.singletonMap("greeting", greetingService.
        sayHello("Diego", "Hola Como estas")));
    }

    @GetMapping("/greetingerror")
    public ResponseEntity<?> greetingError (){
        return ResponseEntity.ok(Collections.singletonMap("greeting", greetingService.
        sayHelloError("Diego", "Hola Como estas")));
    }

}
