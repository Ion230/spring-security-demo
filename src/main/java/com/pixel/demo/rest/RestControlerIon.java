package com.pixel.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class RestControlerIon {
        @GetMapping("/arata")
        public String afisareMesaj() {
            return "Spring Securityy";
        }
}
