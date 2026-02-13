package com.producer.controller;

import com.producer.service.KafkaProducerService;
import org.springframework.web.bind.annotation.*;

//jdbc
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;


@RestController
@RequestMapping("/producer")
public class ProducerController {

    @Autowired
    private final KafkaProducerService kafkaProducerService;

    public ProducerController(KafkaProducerService kafkaProducerService) {
        this.kafkaProducerService = kafkaProducerService;
    }

//    @GetMapping("/send")
//    public String send(@RequestParam String message) {
//        return kafkaProducerService.sendMessage(message);
//    }

    //jdbc
    // Accept JSON payload: { "message": "Hello World" }
    @PostMapping("/send")
    public String send(@RequestBody Map<String, String> payload) {
        String message = payload.get("message");
        return kafkaProducerService.sendMessage(message);
    }


    public void sendToDatabase() {

    }
}
