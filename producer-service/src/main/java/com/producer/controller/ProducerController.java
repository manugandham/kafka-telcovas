package com.producer.controller;

import com.producer.service.KafkaProducerService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/producer")
public class ProducerController {

    private final KafkaProducerService kafkaProducerService;

    public ProducerController(KafkaProducerService kafkaProducerService) {
        this.kafkaProducerService = kafkaProducerService;
    }

    @GetMapping("/send")
    public String send(@RequestParam String message) {
        return kafkaProducerService.sendMessage(message);
    }
}
