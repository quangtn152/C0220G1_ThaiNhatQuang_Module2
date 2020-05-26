package com.codegym.blog.repository;

import com.codegym.blog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog,Long> {
//    Page<Blog> findAllByFirstNameContaining(String title, Pageable pageable);
    Page<Blog> findByTitleContaining(String title, Pageable pageable);
    Page<Blog> findAllByTitleContainingOrderByDateCreateDesc(String title, Pageable pageable);

}
