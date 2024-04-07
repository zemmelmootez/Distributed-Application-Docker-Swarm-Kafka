package com.micro.microservice2.Services;


import com.micro.microservice2.Repository.UserRepository;
import com.micro.microservice2.models.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    public final UserRepository userRepository;


    public List<User> getAll() {
        return userRepository.findAll();
    }

}
