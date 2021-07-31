package com.example.ujianandroid2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ujianandroid2.entity.Product;
import com.example.ujianandroid2.entity.Response;
import com.example.ujianandroid2.service.ModelProduct;

@RestController
@RequestMapping("/")
public class ProductController {
	
	@Autowired
	ModelProduct modelProduct;
	
	@GetMapping("/variant/all")
	public ResponseEntity<Response> getAll() {
		Response response = new Response<>();
		response.setStatus(200);
		response.setMessage("Berhasil mendapatkan data");
		response.setData(this.modelProduct.getAllProduct());
		return ResponseEntity.status(HttpStatus.OK)
				.contentType(MediaType.APPLICATION_JSON)
				.body(response);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Response> addProduct(@RequestBody Product product) {
		Response response = new Response<>();
		response.setStatus(200);
		response.setMessage("Berhasil menambahkan data");
		response.setData(this.modelProduct.addProduct(product));
		return ResponseEntity.status(HttpStatus.OK)
				.contentType(MediaType.APPLICATION_JSON)
				.body(response);
	}
}
