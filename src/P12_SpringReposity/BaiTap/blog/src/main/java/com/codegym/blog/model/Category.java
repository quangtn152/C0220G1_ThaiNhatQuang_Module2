package com.codegym.blog.model;

import javax.persistence.*;

@Entity
@Table(name = "categorys")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    public Category() {
    }
    @ManyToOne
    @JoinColumn(name = "blog_id")
    Blog blog;

    public Category(Blog blog) {
        this.blog = blog;
    }

    public Category(Long id, String name, Blog blog) {
        this.id = id;
        this.name = name;
        this.blog = blog;
    }

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
