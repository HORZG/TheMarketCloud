package com.example.themarketcloud.Controllers;


import com.example.themarketcloud.Entity.Products;
import com.example.themarketcloud.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService ;


    // ALL PRODUCTS
    @GetMapping
    public ResponseEntity<List<Products>> getAllProducts () {
        List<Products> products = productService.getAllProducts();
        return ResponseEntity.ok(products);
    }


    @PostMapping("/add")
    public ResponseEntity<Products> addProduct(@RequestBody Products product){
        Products createdProduct = productService.addProduct(product);
        return ResponseEntity.ok(createdProduct);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Products> getProductById(@PathVariable Long id) {
        Products product = productService.getProductById(id);
        if (product != null) {
            return ResponseEntity.ok(product);
        }else {
            return ResponseEntity.notFound().build();
        }
    }



@DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {
        boolean isDeleted = productService.deleteProductById(id);
        if(isDeleted){
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
}



}
