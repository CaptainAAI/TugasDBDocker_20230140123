package com.praktikumDB.deploy.controller;


import com.praktikumDB.deploy.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public String AddUser() {
        return "User added successfully";
    }
    @GetMapping
    public String GetAllUser() {
        return "Get all users";
    }
    @GetMapping
    public String GetUserById() {
        return "Get user by id";
    }
    @PutMapping
    public String UpdateUser() {
        return "User updated successfully";
    }
    @DeleteMapping
    public String DeleteUser() {
        return "User deleted successfully";


}

