package com.example.gitdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/shopping-list-items")
public class Controller {
    @GetMapping
    public List<String> get() {
        return List.of(
                "boter",
                "Kaas",
                "Scharrel Eieren",
                "Biologisch Sinasappelsap"
        );
    }
}
