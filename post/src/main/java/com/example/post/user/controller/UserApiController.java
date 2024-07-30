package com.example.post.user.controller;

import com.example.post.user.model.UserEntity;
import com.example.post.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserApiController {
    private final UserService userService;

    // UserEntity를 받으면 안되지만 아직 패키지 분리 등을 안하고 하기 위해 처리 하였음.
    @PutMapping("")
    public UserEntity create(@RequestBody UserEntity userEntity) {
        return userService.save(userEntity);
    }

    @GetMapping("/all")
    public List<UserEntity> findAll() {
        return userService.findAll();
    }

    // delete
    @DeleteMapping("/id/{id}")
    public void delete(@PathVariable Long id) {
        // userService.delete(id);
    }

    // findById -> PathVariable
    @GetMapping("/id/{id}")
    public UserEntity findById(@PathVariable Long id) {
        var response = userService.findById(id);
        return response.get();
    }

    @GetMapping("/score")
    public List<UserEntity> filterScore(@RequestParam int score) {
        return userService.filterScore(score);
    }

    @GetMapping("/min_max")
    public List<UserEntity> filterScore(@RequestParam int min, @RequestParam int max) {
        return userService.filterScore(min, max);
    }
}
