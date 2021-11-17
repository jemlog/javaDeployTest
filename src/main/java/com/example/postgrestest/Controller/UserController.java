package com.example.postgrestest.Controller;

import com.example.postgrestest.Service.UserService;
import com.example.postgrestest.domain.user.User;
import com.example.postgrestest.domain.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/")
    public List<User> addUser()
    {
        userService.createUser(User.builder().name("jemin").age(24).build());
        return userService.getAllUser();
    }


    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable("id") Long id)
    {
        return userService.deleteUser(id);
    }

}
