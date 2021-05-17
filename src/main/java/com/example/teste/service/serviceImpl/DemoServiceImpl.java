package com.example.teste.service.serviceImpl;

import com.example.teste.model.Post;
import com.example.teste.repository.DemoRepository;
import com.example.teste.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    DemoRepository demoRepository;

    @Override
    public List<Post> findAll() {
        return demoRepository.findAll();
    }

    @Override
    public Post findById(long id) {
        return demoRepository.findById(id).get();
    }

    @Override
    public Post save(Post post) {
        return demoRepository.save(post);
    }
}
