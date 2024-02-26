package com.example.task1.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    @Id
    @GeneratedValue
    private long id;
    private String text;
    @ManyToOne
    @JoinColumn(name = "post_id", nullable = false)
    private Post post;

}
