package com.example.ujianandroid2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ujianandroid2.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
