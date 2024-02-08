package com.prameswaradev.ngajarinrest.service;

import com.prameswaradev.ngajarinrest.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import static org.springframework.http.HttpStatus.OK;


@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;
    @Override
    public ResponseEntity<?> findAll() {
        var users = userRepository.findAll();
        return new ResponseEntity<>(users, OK);
    }
}
