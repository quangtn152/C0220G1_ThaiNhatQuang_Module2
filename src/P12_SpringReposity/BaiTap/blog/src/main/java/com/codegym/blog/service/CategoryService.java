package com.codegym.blog.service;


import com.codegym.blog.model.Blog;
import com.codegym.blog.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CategoryService {
    List<Category> findAll();

    Category findById(Long id);

    void save(Category category);

    void remove(Long id);

    Page<Category> findAll(Pageable pageable);

    Page<Category> findNameContaining(String name, Pageable pageable);

}
