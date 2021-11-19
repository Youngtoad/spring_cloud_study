package com.example.userservice.jpa;

import com.example.userservice.jpa.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Long> {
    UserEntity findByUserId(String userId);

    UserEntity findByEmail(String username);
    //findBy -> select로 생성
}
