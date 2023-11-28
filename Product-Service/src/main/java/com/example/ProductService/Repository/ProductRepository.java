package com.example.ProductService.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.ProductService.Model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer>{
	
//	List<Product> findByName(String name);
//	List<Product> findByCategory(String Category);
//	List<Product> findByPriceLessThanEqual(int price);
//	
//	@Query("select * from product p where p.name=?1 and p.category=?2")
//	List <Product> getByName(String name,String Category);

}
