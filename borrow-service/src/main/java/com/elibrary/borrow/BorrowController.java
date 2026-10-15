package com.elibrary.borrow;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BorrowController {

    @GetMapping("/borrow")
    public String borrowBook() {
        return "Borrow Service is working!";
    }
}