package com.example.springAn03JPA.data.repositories;

import com.example.springAn03JPA.data.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <UserEntity,Long> {
}
