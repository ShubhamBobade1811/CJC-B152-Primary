package com.mian.service;

import java.util.Optional;

import com.mian.model.Product;

public interface ProServiceI {

	 public Product addProduct(Product p);

	public Iterable<Product> viewProducts();



	public Product updatePro(Product p, int productId);

	public void deletePro(Product pro, int productId);

	public Product getProduct(int productId);


}
