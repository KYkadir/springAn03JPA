package com.example.springAn03JPA.config;

import com.example.springAn03JPA.data.UserStatus;
import com.example.springAn03JPA.data.entities.MessageEntity;
import com.example.springAn03JPA.data.entities.UserEntity;
import com.example.springAn03JPA.data.repositories.MessageRepository;
import com.example.springAn03JPA.data.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Configuration
public class DBConfig implements CommandLineRunner {
    private MessageRepository messageRepository;
    private UserRepository userRepository;

    public DBConfig(MessageRepository messageRepository, UserRepository userRepository) {
        this.messageRepository = messageRepository;
        this.userRepository = userRepository;
    }

    Random random = new Random();

    @Override
    public void run(String... args) throws Exception {
        for (int i = 0; i < 5; i++) {
            UserEntity sender = new UserEntity();
            sender.setEmail("user" + i + "@" + random.nextInt(100) + ".com");
            sender.setPass(Integer.toString(random.nextInt()));
            sender.setStatus(UserStatus.ACTIVE);
            userRepository.save(sender);


            UserEntity receiver = new UserEntity();
            receiver.setEmail("user" + i + "@" + random.nextInt(100) + ".com");
            receiver.setPass(Integer.toString(random.nextInt()));
            receiver.setStatus(UserStatus.ACTIVE);
            userRepository.save(receiver);

            UserEntity receiver2 = new UserEntity();
            receiver2.setEmail("user" + i + "@" + random.nextInt(100) + ".com");
            receiver2.setPass(Integer.toString(random.nextInt()));
            receiver2.setStatus(UserStatus.ACTIVE);
            userRepository.save(receiver2);

            for (int j = 0; j < 5; j++) {
                MessageEntity msg = new MessageEntity();
                msg.setSender(sender);
                msg.setBody("body from message" + i + j * 4);
                msg.setSubject("subject of message" + i * j * 8);
                msg.setReceivers(List.of(
                        receiver, receiver2
                ));
                messageRepository.save(msg);
            }
        }
    }
}
