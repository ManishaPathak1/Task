package com.example.task1.UserRepository;

import com.example.task1.Entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Post,Long> {
}
