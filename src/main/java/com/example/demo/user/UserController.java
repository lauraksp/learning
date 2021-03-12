package com.example.demo.user;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserEntity> getUsers(){
        return userService.getUsers();
    }

    @GetMapping("/{id}")
    public UserEntity getUserById(@PathVariable("id") Integer id){
        return userService.getUserById(id);
    }

    @GetMapping("/name/{word}")
    public List<UserEntity> getUserByFirstname(@PathVariable("word") String word){
        return userService.getUserByFirstname(word);
    }

    @GetMapping("/email/{email}")
    public List<UserEntity> getUserByEmail(@PathVariable("email") String email){
        return userService.getUserByEmail(email);
    }

    @PostMapping
    public UserEntity saveUser(@RequestBody UserEntity user) {
        return userService.saveUser(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable("id") Integer id) {
         userService.git (id);
    }






//    @PostMapping
}
