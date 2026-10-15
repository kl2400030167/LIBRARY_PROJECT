package com.elibrary.fine;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FineController {

    @GetMapping("/fine")
    public String calculateFine() {
        return "Fine Service is working!";
    }
}