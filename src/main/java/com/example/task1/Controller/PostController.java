package com.example.task1.Controller;

import com.example.task1.Entity.Comment;
import com.example.task1.Entity.Post;
import com.example.task1.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {
    @Autowired
    private PostService postService;

    @PostMapping
    public Post createPost(@RequestBody Post post) {
        return postService.createpost(post);
    }

    @PostMapping("/{postId}/comments")
    public Post addCommentToPost(@PathVariable Long postId, @RequestBody Comment comment) {
        return postService.addComment(postId, comment);
    }
}

