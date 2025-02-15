package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PostService {
    private final List<Post> posts = new ArrayList<>(List.of(
            new Post(0L, "1 January", Calendar.getInstance().getTime()),
            new Post(1L, "14th February", Calendar.getInstance().getTime()),
            new Post(2L, "8th March", Calendar.getInstance().getTime())));

    public List<Post> listAllPosts() {
        return posts;
    }

    public void create(String text) {
        Long newId = (long) posts.size();
        posts.add(new Post(newId, text, new Date()));
    }
}
