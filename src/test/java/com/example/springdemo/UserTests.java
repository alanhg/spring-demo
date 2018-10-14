package com.example.springdemo;

import com.example.springdemo.constant.Sex;
import com.example.springdemo.domain.User;
import com.example.springdemo.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTests {

    @Autowired
    UserRepository userRepository;

    @Test
    public void should_save_user() {
        userRepository.save(new User(UUID.randomUUID().toString(), "Alan", Sex.MALE, null));
        userRepository.findAll().forEach(user1 -> System.out.println(user1.getSex() == Sex.FEMALE));
    }

}
