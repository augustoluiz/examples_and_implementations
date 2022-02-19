package com.schoolofnet.CalcService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/")
public class CalcController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/calc/{num1}/{num2}")
    public ResponseEntity<String> calc(@PathVariable("num1") Double num1,
                                       @PathVariable("num2") Double num2){

        String sumServiceResult = restTemplate.getForObject("http://sum-service/sum/{num1}/{num2}", String.class, num1, num2);
        Double calcServiceResult = num1 - num2;
        return ResponseEntity.ok("Resturn from all: ".concat(sumServiceResult).concat(" ").concat(String.valueOf(calcServiceResult)));
    }
}
