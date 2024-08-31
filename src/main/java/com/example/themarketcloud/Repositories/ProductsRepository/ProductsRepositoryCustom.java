package com.example.themarketcloud.Repositories.ProductsRepository;

import com.example.themarketcloud.Entity.Products;

import java.security.PublicKey;
import java.util.List;

public interface ProductsRepositoryCustom {

    public List<Products> findAllProducts();

         public Products getProductById(Integer id);
}
