package com.example.themarketcloud.Controllers;

import com.example.themarketcloud.Entity.Users;
import com.example.themarketcloud.Services.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    public UserService userService ;

// all users
    @GetMapping
    public ResponseEntity<List<Users>> getAllUsers() {
        List<Users> users = userService.getAllUsers();
        return ResponseEntity.ok(users);

    }

    @PostMapping("/adduser")
    public ResponseEntity<Users> addUser(@RequestBody Users user){
       Users createdUser = userService.addUser(user);
       return ResponseEntity.ok(createdUser);
    }

    @GetMapping("{id]")
    public ResponseEntity<Users> getUserById(@PathVariable Long id) {
        Users user = userService.getUserById(id);
        if(user != null) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.notFound().build();
        }
    }



}
