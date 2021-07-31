package com.example.ujianandroid2.service;

import java.util.List;

import com.example.ujianandroid2.entity.Product;

public interface ModelProductInterface {
	public List<Product> getAllProduct();
	public String addProduct(Product product);
}
