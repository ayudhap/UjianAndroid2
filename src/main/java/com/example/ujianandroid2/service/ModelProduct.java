package com.example.ujianandroid2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ujianandroid2.entity.Product;
import com.example.ujianandroid2.repository.ProductRepository;

@Service
public class ModelProduct implements ModelProductInterface {

	@Autowired
	ProductRepository productRepository;
	
	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return this.productRepository.findAll();
	}

	@Override
	public String addProduct(Product product) {
		// TODO Auto-generated method stub
		this.productRepository.save(product);
		return "Berhasil menambahkan data";
	}

}
