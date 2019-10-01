package com.example.springbootmonolith.controller;

import com.example.springbootmonolith.models.JwtResponse;
import com.example.springbootmonolith.models.User;
import com.example.springbootmonolith.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/admin/user/list")
    public Iterable<User> listUsers(){
        return userService.listUsers();
    }

    @PostMapping("/signup")
    public ResponseEntity<?> createUser(@RequestBody User newUser) {
        return ResponseEntity.ok(new JwtResponse(userService.createUser(newUser)));
    }

//    @PostMapping("/signup")
//    public User createUser(@RequestBody User newUser) {
//        return userService.createUser(newUser);
//    }

//    @GetMapping("/login/{username}/{password}")
//    public User login(@PathVariable String username, @PathVariable String password){
//        return userService.login(username, password);
//    }

    @PutMapping("/user/{username}/{courseId}")
    public User addCourse(@PathVariable String username, @PathVariable int courseId){
        return userService.addCourse(username, courseId);
    }

    @DeleteMapping("/user/{userId}")
    public HttpStatus deleteUserById(@PathVariable Long userId) {
        return userService.deleteById(userId);
    }

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World!!";
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody User user) {
        return ResponseEntity.ok(new JwtResponse(userService.login(user)));
    }



}
