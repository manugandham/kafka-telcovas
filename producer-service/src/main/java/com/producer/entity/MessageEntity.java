//package com.producer.entity;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
//import org.springframework.jdbc.core.JdbcTemplate;
//
//
//import java.time.LocalDateTime;
//
//@Entity
//@Table(name = "message_info")
//public class MessageEntity {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private String message;
//    private String createdAt;
//
//    // getters + setters
//
////    public void insertMessage(String message) {
////        String sql = "INSERT INTO messages(content, created_at) VALUES (?, ?)";
////       // jdbcTemplate.update(sql, message, LocalDateTime.now());
////    }
//
//    // Setter for message
//    public void setMessage(String message) {
//        this.message = message;
//    }
//
//    // Setter for createdAt
//    public void setCreatedAt(String createdAt) {
//        this.createdAt = createdAt;
//    }
//}
//
//
//


package com.producer.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "message_info") // matches your MySQL table
public class MessageEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String message;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    public MessageEntity() {}

    public MessageEntity(String message) {
        this.message = message;
        this.createdAt = LocalDateTime.now();
    }

    // getters & setters
    public Long getId() { return id; }
    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
}
