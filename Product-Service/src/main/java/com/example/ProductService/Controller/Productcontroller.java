package com.example.ProductService.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ProductService.Exception.EmailValidationException;
import com.example.ProductService.Exception.IdNotFoundException;
import com.example.ProductService.Exception.NameValidationException;
import com.example.ProductService.Model.Product;
import com.example.ProductService.Service.Productservice;

@RestController
@RequestMapping("/products")
public class Productcontroller {

	@Autowired
	private Productservice productservice;

	@PostMapping("/Product")
	public Product addProduct(@RequestBody Product product) {
		if (!product.getEmail().contains("@")) {
			throw new EmailValidationException("Not a valid format :: " + product.getEmail());
		}
		if (!Character.isUpperCase(product.getName().charAt(0))) {
			throw new NameValidationException("Name should starts with capital letter :: " + product.getName());
		}
		return productservice.addProduct(product);
	}

	@GetMapping("/allProducts")
	public List<Product> getallProducts() {
		return (List<Product>) productservice.getallProducts();
	}

	@GetMapping("/getbyId/{id}")
	public Product getById(@PathVariable("id") int id) {
		return productservice.getbyId(id);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteById(@PathVariable int id) {
	    try {
	        productservice.deleteById(id);
	        return ResponseEntity.ok("Successfully deleted " + id);
	    } catch (IdNotFoundException e) {
	        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Provided ID not found: " + id);
	    }
	}

//	@DeleteMapping("/{id}")
//	public String deletebyId(@PathVariable int id) {
//		if (productservice.deleteById(id)) {
//			return "Successfully deleted " + id;
//		} else {
//			throw new IdNotFoundException("Provided ID Not found");
//		}
//	}


}
