package com.example.themarketcloud.Repositories.ProductsRepository;

import com.example.themarketcloud.Entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductsRepository extends JpaRepository<Products,Long>, ProductsRepositoryCustom {
    @Override
    default List<Products> findAllProducts() {
        return List.of();
    }
}
