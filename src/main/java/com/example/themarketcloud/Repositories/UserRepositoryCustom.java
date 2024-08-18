package com.example.themarketcloud.Repositories;

import com.example.themarketcloud.Entity.Users;

import java.util.List;

public interface UserRepositoryCustom {

   List<Users> findAllUsers();

   Users getUserById(String id);

   Users getUserByName(String name);

   void deleteUserById(String id);


}
