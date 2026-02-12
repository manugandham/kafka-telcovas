package com.consumer.a.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerAService {

    @KafkaListener(topics = "demo-topic", groupId = "group-a")
    public void consume(String message) {
        System.out.println("Consumer-A Received: " + message);
    }
}
