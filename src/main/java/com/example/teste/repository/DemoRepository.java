package com.example.teste.repository;

import com.example.teste.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemoRepository extends JpaRepository <Post, Long> {
}
