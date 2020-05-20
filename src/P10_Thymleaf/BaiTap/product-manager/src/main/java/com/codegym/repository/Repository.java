package com.codegym.repository;

import com.codegym.model.Product;

import java.util.List;

public interface Repository <T> {
    void create(int id, Product product);
    Product findById(int id);


    List<T> findAll();

    T findByName(String name);

    void update(int id,T model);

    void remove(int id);
}