package com.deepak.devops.productservice.controller;

import com.deepak.devops.productservice.entity.Product;
import com.deepak.devops.productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/products")
public class ProductController {
    private final ProductService productService;

    /**
     * Endpoint to get all products.
     *
     * @return List of all products
     */
    @GetMapping("/all")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    /**
     * Endpoint to save a product.
     *
     * @param product Product to be saved
     * @return Saved product
     */
    @PostMapping("/save")
    public Product saveProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }
    /**
     * Endpoint to delete a product.
     *
     * @param product Product to be deleted
     */
    @DeleteMapping("/delete/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }

}
