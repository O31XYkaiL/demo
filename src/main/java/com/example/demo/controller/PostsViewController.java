package com.example.demo.controller;

import com.example.demo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostsViewController {
    protected final PostService postService;

    @Autowired
    public PostsViewController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/")
    public String list(Model model) {
        model.addAttribute("posts", postService.listAllPosts()); // Исправлено на "posts"
        return "list";
    }

    @ResponseBody
    @GetMapping("/post/{id}")
    public String single(@PathVariable("id") Long id) {
        return "Здесь находится пост №" + id;
    }
}