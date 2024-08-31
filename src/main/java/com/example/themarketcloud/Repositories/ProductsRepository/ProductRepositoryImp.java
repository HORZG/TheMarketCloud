package com.example.themarketcloud.Repositories.ProductsRepository;

import com.example.themarketcloud.Entity.Products;
import com.example.themarketcloud.Entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepositoryImp implements ProductsRepositoryCustom{


    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<Products> findAllProducts() {
        return mongoTemplate.findAll(Products.class);

    }

    @Override
    public Products getProductById (Integer id){
        return mongoTemplate.findById(id, Products.class);
    }
}
