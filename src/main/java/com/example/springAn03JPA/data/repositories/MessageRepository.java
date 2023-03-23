package com.example.springAn03JPA.data.repositories;

import com.example.springAn03JPA.data.entities.MessageEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<MessageEntity,Long> {
}
