package com.example.Booking;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class yatra {
    @GetMapping("/myyatra")
    public String getData() {return "Please Book";}
}
