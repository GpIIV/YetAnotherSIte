package com.example.yetanothersite.Service;


import com.example.yetanothersite.Model.Product;
import com.example.yetanothersite.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> GetAllproducts(){
        return productRepository.findAll();
    }

    public Product GetProductById(Long id){
        return productRepository.findById(id).orElse(null);
    }

    public Product SaveProduct(Product product){
        return productRepository.save(product);
    }

    public void DeleteProduct(Long id){
        productRepository.deleteById(id);
    }
}
