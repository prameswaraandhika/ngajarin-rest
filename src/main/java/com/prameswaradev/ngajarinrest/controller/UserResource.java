package com.prameswaradev.ngajarinrest.controller;


import com.prameswaradev.ngajarinrest.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserResource {

    private final UserService userService;

    @GetMapping(value = "/users")
    public ResponseEntity<?> getUsers(){
        return userService.findAll();
    }

}
