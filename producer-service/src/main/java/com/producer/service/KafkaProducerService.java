package com.producer.service;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

//JDBC
import java.time.LocalDateTime;
import com.producer.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.producer.entity.MessageEntity;
import org.springframework.beans.factory.annotation.Value;


@Service
public class KafkaProducerService {

    private final KafkaTemplate<String, String> kafkaTemplate;

    //JBDC
    @Autowired
    private MessageRepository messageInfoRepository;

    // Read topic name from application.yaml
    @Value("${kafka.topic.name}")
    private String topic;

    public KafkaProducerService(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public String sendMessage(String message) {

        if (message == null || message.isEmpty()) {
            return "Message cannot be empty";
        }

        // 1. Save to DB
        MessageEntity msg = new MessageEntity();
         msg.setMessage(message);
        msg.setCreatedAt(LocalDateTime.now());
        messageInfoRepository.save(msg);

        kafkaTemplate.send("demo-topic", message);
        return "Message sent: " + message;
    }
}
