package com.example.ProductService.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ProductService.Model.Product;
import com.example.ProductService.Repository.ProductRepository;

@Service
public class Productservice {

	@Autowired
	private ProductRepository productRepository;

	public Product addProduct(Product product) {
		return productRepository.save(product);
	}

	public List<Product> getallProducts() {
		return (List<Product>) productRepository.findAll();
	}

	public Product getbyId(int id) {
		return productRepository.findById(id).orElse(null);
	}

	public boolean deleteById(int id) {		
		productRepository.deleteById(id);
		return false;
	}

}
