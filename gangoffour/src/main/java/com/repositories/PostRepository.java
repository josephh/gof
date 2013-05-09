package com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gof.entities.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
