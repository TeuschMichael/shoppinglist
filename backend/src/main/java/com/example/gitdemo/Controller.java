package com.example.gitdemo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
// toet toet dit blokt github als het goed is
@RestController
@CrossOrigin("http://localhost:5173")
@RequestMapping("/api/v1/shopping-list-items")
public class Controller {
    @GetMapping
    public List<String> get() {
        return List.of(
                "boter",
                "Kaas",
                "Spek"
        );
    }
}
