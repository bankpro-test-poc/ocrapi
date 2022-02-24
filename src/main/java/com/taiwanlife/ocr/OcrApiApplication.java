package com.taiwanlife.ocr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OcrApiApplication {

    @GetMapping("/api/ocr")
    public String ocr() {
        return "OCR API had been called!!! sit";
    }
	
	public static void main(String[] args) {
		SpringApplication.run(OcrApiApplication.class, args);
	}

}
