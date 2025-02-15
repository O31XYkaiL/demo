package com.example.demo.model;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Post {
    private final String text;
    private int likes;
    private Date creationDate;

    public Post(String text,  Date creationDate) {
        this.text = text;
        this.creationDate = new Date();
    }
}
