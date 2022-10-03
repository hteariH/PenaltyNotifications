package com.mamoru.penaltynotifications;

import javafx.geometry.Rectangle2D;
import javafx.scene.text.Font;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@SpringBootApplication
@RestController
public class PenaltyNotificationsApplication {

    public static void main(String[] args) {
        SpringApplication.run(PenaltyNotificationsApplication.class, args);
    }

    @RequestMapping("/")
    public String home() {
        return "Hello Docker World";
    }
}


