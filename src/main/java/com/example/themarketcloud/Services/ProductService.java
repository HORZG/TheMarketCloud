package com.example.themarketcloud.Services;

import com.example.themarketcloud.Entity.Products;
import com.example.themarketcloud.Repositories.ProductsRepository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class ProductService {

    @Autowired
    private ProductsRepository productsRepository ;

    public List<Products> getAllProducts (){
        return productsRepository.findAll();
    }


    public Products addProduct (Products Pr) {
        return productsRepository.save(Pr);


    }


    public Products getProductById (Long id){
        Optional<Products> product = productsRepository.findById(id);
        return product.orElse(null);
    }

    public boolean deleteProductById (Long id) {
        Optional<Products> productToDelete = productsRepository.findById(id);
        if(productToDelete.isPresent()){
            productsRepository.deleteById(id);
            return true;
        }

        return false;
    }




}
