package com.example.demo.controller;

import com.example.demo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PostsCreateController {
    protected final PostService postService;

    @Autowired
    public PostsCreateController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/new")
    public String create(Model model) {
        return "create";
    }

    @PostMapping("/new")
    public String doCreate(@ModelAttribute("text") String text) {
        postService.create(text);
        return "redirect:/";
    }
}
