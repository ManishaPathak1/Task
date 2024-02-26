package com.example.task1.Service;

import com.example.task1.Entity.Comment;
import com.example.task1.UserRepository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;

    public Comment Createcomment(Comment comment) {
        return commentRepository.save(comment);
    }
}
