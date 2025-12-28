package ru.bmstu.api.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = {
        "http://192.168.56.1:3000"
})

@RequestMapping("/api")
public class HelloController {

    @GetMapping("/url1")
    public String url1() {
        return "Привет CI/CD!!!";
    }

    @GetMapping("/url2")
    public int url2() {
        return 2025;
    }

    @GetMapping("/url3")
    public Boolean url3() {
        return true;
    }
}
