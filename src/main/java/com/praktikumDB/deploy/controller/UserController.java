package com.praktikumDB.deploy.controller;


import com.praktikumDB.deploy.model.User;
import com.praktikumDB.deploy.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public String createUser(@RequestBody User request){
        userService.AddUser(request);
        return "User created successfully";
    }

    @GetMapping
    public List<User> getAllUsers(){
        return userService.GetAllUser();
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable String id){
        userService.DeleteUser(id);
        return "User deleted successfully";
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable String id){
        return userService.GetUserById(id);
    }

    @PutMapping("/{id}")
    public String updateUser(@PathVariable String id, @RequestBody User request){
        userService.UpdateUser(id, request);
        return "User updated successfully";
    }


}

