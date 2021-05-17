package com.example.teste.service;

import com.example.teste.model.Post;

import java.util.List;

public interface DemoService {

    List<Post> findAll();
    Post findById(long id);
    Post save(Post post);
}
