package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PostService {
    List<Post> posts = new ArrayList<>(List.of(
            new Post("1 January", Calendar.getInstance().getTime()),
            new Post("14th February", Calendar.getInstance().getTime()),
            new Post("8th March", Calendar.getInstance().getTime())));

    public List<Post> listAllPosts() {
        return posts;
    }

    public void create(String text) {
        posts.add(new Post(text, new Date()));
    }
}
