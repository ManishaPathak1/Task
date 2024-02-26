package com.example.task1.UserRepository;

import com.example.task1.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<User,Integer> {
    public User findByUsernameandPassword(String Username,String Password);

}
