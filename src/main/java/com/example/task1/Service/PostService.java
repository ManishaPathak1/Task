package com.example.task1.Service;

import com.example.task1.Entity.Comment;
import com.example.task1.Entity.Post;
import com.example.task1.UserRepository.CommentRepository;
import com.example.task1.UserRepository.ImageRepository;
import com.example.task1.UserRepository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;
    @Autowired
    private CommentRepository commentRepository;
    @Autowired
    private ImageRepository imageRepository;

    public Post createpost(Post post){
        return postRepository.save(post);
    }

    public Post addComment(long postId, Comment comment) {
        Post post = postRepository.findById(postId).orElse(null);
        if (post != null) {
            comment.setPost(post);
            post.getComments().add(commentRepository.save(comment));
            return postRepository.save(post);
        }
        return null;
    }

}
