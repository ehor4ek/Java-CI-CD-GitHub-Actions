package ru.bmstu.api.controller;

import org.springframework.web.bind.annotation.*;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.client.RestTemplate;

import java.util.Random;

//@RestController
//@CrossOrigin(origins = {
//        "http://192.168.56.1:3000"
//})

@RequestMapping("/api")
public class HelloController {

//    private final RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/getNum")
    public String sayHello(HttpServletResponse response) {

//        String counterUrl = "http://10.104.156.64:8081/count";
//        try {
//            restTemplate.getForObject(counterUrl, String.class);
//        } catch (Exception e) {
//            System.err.println("Не удалось связаться с приложением-счётчиком: " + e.getMessage());
//        }

        response.setHeader("Connection", "close");

        Random random = new Random();
        int num = (random.nextInt(1000));
        String name = System.getenv("NODE_NAME");
        int a = 0;
        for (int i = 0; i < 100000; i++) {
            a += 10;
        }
        return "{\"num\": " + num + ", \"name\": \"" + name + "\"}";
    }
}
