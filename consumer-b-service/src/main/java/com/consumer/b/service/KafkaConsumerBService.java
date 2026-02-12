package com.consumer.b.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerBService {

    @KafkaListener(topics = "demo-topic", groupId = "group-b")
    public void consume(String message) {
        System.out.println("Consumer-B Received: " + message);
    }
}
