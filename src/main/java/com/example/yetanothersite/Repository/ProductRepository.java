package com.example.yetanothersite.Repository;

import com.example.yetanothersite.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
