package com.example.springAn03JPA.data.entities;

import com.example.springAn03JPA.data.UserStatus;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="tbl_users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String pass;
    @Enumerated
    private UserStatus status;
    public UserEntity(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public UserStatus getStatus() {
        return status;
    }

    public void setStatus(UserStatus status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserEntity)) return false;
        UserEntity that = (UserEntity) o;
        return getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", pass='" + pass + '\'' +
                ", status=" + status +
                '}';
    }
}
