package com.example.demospringexc2.controller;

import com.example.demospringexc2.model.Excercise;
import com.example.demospringexc2.repository.ExcerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ExcerciseController {

@Autowired
private ExcerciseRepository excerciseRepository;

    @GetMapping("/excercise")
        public List<Excercise> getAllExcercise() {
           return excerciseRepository.findAll();
    }
}
