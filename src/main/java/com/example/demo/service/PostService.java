package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class PostService {
    public List<Post> listAllPosts() {
        return Arrays.asList(
                new Post("1 January", 15),
                new Post("14th February", 10),
                new Post("8th March", 5)
        );
    }
}
