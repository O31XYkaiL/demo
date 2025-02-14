package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Post {
    private final String text;
    private final int likes;

    public Post(String text, int likes) {
        this.text = text;
        this.likes = likes;
    }
}
