package com.mian.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;

import com.mian.exception.ProductNotFoundException;
import com.mian.model.Product;
import com.mian.repos.ProRepos;

@Service
public class ProServiceImpl implements ProServiceI {
	
	@Autowired
	ProRepos pr;

	@Override
	public Product addProduct(Product p) {
		Product save = pr.save(p);
		return save;
	}

	@Override
	public Iterable<Product> viewProducts() {
		Iterable<Product> list = pr.findAll();
		return list;
	}

	@Override
	public Product updatePro(Product p, int productId) {
		Optional<Product> id = pr.findById(productId);
		if(id.isPresent()) {
			Product product = pr.save(p);
			return product;
		}else {
			return new Product();
		}
	}

	@Override
	public void deletePro(Product pro, int productId) {
		Optional<Product> product = pr.findById(productId);
		if(product.isPresent()) {
			pr.deleteById(productId);
		}
	}

	@Override
	public Product getProduct(int productId) {
		Optional<Product> product = pr.findById(productId);
		
		if(product.isPresent()) {
			return product.get();
		}else {
			throw new ProductNotFoundException("No Product Details Available");
		}
	}



	
	

	
	


}
