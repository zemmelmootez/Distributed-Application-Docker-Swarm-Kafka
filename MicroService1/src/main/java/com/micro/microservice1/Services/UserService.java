package com.micro.microservice1.Services;

import com.micro.microservice1.Repository.UserRepository;
import com.micro.microservice1.models.User;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

@Service
@RequiredArgsConstructor
public class UserService {

    public final UserRepository userRepository;


    public User addUser(User user) {
        User newUser= new User();
        newUser.setName(user.getName());
        newUser.setJob(user.getJob());
        newUser.setCreatedAt(new Timestamp(System.currentTimeMillis()));
        newUser.setUpdatedAt(new Timestamp(System.currentTimeMillis()));
      return   userRepository.save(newUser);
    }



    public User updateUser(String id, User userUpdates) {


        User existingUser = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id: " + id));

        existingUser.setName(userUpdates.getName());
        existingUser.setJob(userUpdates.getJob());
        existingUser.setUpdatedAt(new Timestamp(System.currentTimeMillis()));

        return userRepository.save(existingUser);
    }
}
