package com.example.demo.domain.User;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/")
public class UserResource {

    private UserRepository userRepository;

    public UserResource(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping(value = "save")
    public ResponseEntity<?> saveUser(@RequestBody User user) {
        userRepository.save(user);
        return ResponseEntity.ok().body("New User Added");
    }
}
