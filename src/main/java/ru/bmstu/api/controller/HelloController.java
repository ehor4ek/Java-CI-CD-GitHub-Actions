package ru.bmstu.api.controller;

import org.springframework.web.bind.annotation.*;
import jakarta.servlet.http.HttpServletResponse;

@RestController
@CrossOrigin(origins = {
        "http://192.168.56.1:3000"
})

@RequestMapping("/api")
public class HelloController {

    @GetMapping("/url1")
    public String url1(HttpServletResponse response) {
        return "Привет!";
    }

    @GetMapping("/url2")
    public int url2(HttpServletResponse response) {
        return 2025;
    }

    @GetMapping("/url3")
    public Boolean url3(HttpServletResponse response) {
        return true;
    }
}
