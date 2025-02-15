package com.example.demo.model;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Post {
    private final String text;
    private final int likes;
    private Date creationDate;

    public Post(String text, int likes, Date creationDate) {
        this.text = text;
        this.likes = likes;
        this.creationDate = new Date();
    }
}
