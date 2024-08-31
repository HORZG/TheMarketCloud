package com.example.themarketcloud.Services;

import com.example.themarketcloud.Entity.Users;
import com.example.themarketcloud.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class UserService {

    @Autowired
    public UserRepository userRepository;

    public List<Users> getAllUsers() {
        return userRepository.findAllUsers();

    }

    public Users addUser(Users user) {
        return userRepository.save(user);
    }

    public Users getUserById(Long id){
        Optional<Users> user = userRepository.findById(id);
        return user.orElse(null);
    }

    public boolean deleteUser (Long id) {
        Optional<Users> user = userRepository.findById(id);
        if(user.isPresent()){
            userRepository.delete(user.get());
        return true;
        }
        return false;
    }


}
