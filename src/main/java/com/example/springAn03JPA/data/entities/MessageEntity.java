package com.example.springAn03JPA.data.entities;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name="tbl_messages")

public class MessageEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private UserEntity sender;
    @ManyToMany
    private List<UserEntity> receivers;

    private String subject;
    private String body;
    public MessageEntity(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserEntity getSender() {
        return sender;
    }

    public void setSender(UserEntity sender) {
        this.sender = sender;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public List<UserEntity> getReceivers() {
        return receivers;
    }

    public void setReceivers(List<UserEntity> receivers) {
        this.receivers = receivers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MessageEntity)) return false;
        MessageEntity that = (MessageEntity) o;
        return getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "MessageEntity{" +
                "id=" + id +
                ", sender=" + sender +
                ", receiver=" + receivers +
                '}';
    }
}
