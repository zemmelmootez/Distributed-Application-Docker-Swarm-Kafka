package com.micro.microservice2.Controllers;


import com.micro.microservice2.Services.UserService;
import com.micro.microservice2.models.User;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    public  final UserService userService;

    @GetMapping("/all")
    public List<User> getAllUser() {
        return userService.getAll();
    }
}
