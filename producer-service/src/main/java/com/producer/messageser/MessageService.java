package com.producer.messageser;

import com.producer.entity.MessageEntity;
import com.producer.repository.MessageRepository;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    private final MessageRepository messageRepository;

    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    // Insert message into DB
    public MessageEntity saveMessage(String msg) {
        MessageEntity entity = new MessageEntity();
        entity.setMessage(msg);
        return messageRepository.save(entity);
    }
}

