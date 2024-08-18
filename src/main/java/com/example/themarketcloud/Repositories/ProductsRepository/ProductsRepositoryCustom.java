package com.example.themarketcloud.Repositories.ProductsRepository;

import com.example.themarketcloud.Entity.Products;

import java.util.List;

public interface ProductsRepositoryCustom {

    public List<Products> findAllProducts();
}
