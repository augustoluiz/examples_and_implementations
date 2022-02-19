package com.schoolofnet.SumService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SumController {

    @Value("${spring.application.name}")
    private String serviceName;

    @GetMapping("/sum/{num1}/{num2}")
    public ResponseEntity<String> hello(@PathVariable Double num1,
                                        @PathVariable Double num2){
        return ResponseEntity.ok("Sum Service, ".concat(String.valueOf(num1 + num2)));
    }

}
