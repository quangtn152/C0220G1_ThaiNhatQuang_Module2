package com.codegym.blog.service;


import com.codegym.blog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BlogService {
    List<Blog> finAll();

    Blog findById(Long id);

    void save(Blog blog);

    void remove(Long id);
    Page<Blog> findAll(Pageable pageable);
//    Page<Blog> findAllByFirstNameContaining(String title, Pageable pageable);

    Page<Blog> findByTitleContaining(String title, Pageable pageable);

}
