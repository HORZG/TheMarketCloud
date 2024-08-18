package com.example.themarketcloud.Repositories.ProductsRepository;

import com.example.themarketcloud.Entity.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.List;

public class ProductRepositoryImp implements ProductsRepositoryCustom{


    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<Products> findAllProducts() {
        return mongoTemplate.findAll(Products.class);

    }
}
