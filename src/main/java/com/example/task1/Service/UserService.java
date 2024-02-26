package com.example.task1.Service;

import com.example.task1.Entity.User;
import com.example.task1.UserRepository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UsersRepository usersRepository;
    public User login(String Username, String Password){
        return usersRepository.findByUsernameandPassword(Username,Password);
    }
    public User Registration(User user){
        return  usersRepository.save(user);
    }
}
