package com.example.postgrestest.Service;

import com.example.postgrestest.domain.user.User;
import com.example.postgrestest.domain.user.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional

public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> getAllUser()
    {
        return userRepository.findAll();
    }

    public User createUser(User user){
        return userRepository.save(user);
    }

    public String deleteUser(Long id)
    {
        userRepository.deleteById(id);
        return "delete";
    }


}
