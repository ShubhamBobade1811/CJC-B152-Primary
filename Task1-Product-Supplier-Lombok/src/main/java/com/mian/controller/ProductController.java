package com.mian.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mian.base_response.BaseResponse;
import com.mian.model.Product;
import com.mian.service.ProServiceI;

@CrossOrigin("*")
@RestController
public class ProductController {


	@Autowired
	ProServiceI psi;
	
	@PostMapping("/addPro")
	public ResponseEntity<BaseResponse<Product>> addProdct(@RequestBody Product product){
		 Product p = psi.addProduct(product);
		 BaseResponse<Product> br=new BaseResponse<Product>(201, new Date(), "Data Added", p);
		 return new ResponseEntity<BaseResponse<Product>>(br, HttpStatus.CREATED);
	}
	
	
	@GetMapping("/viewPro")
	public ResponseEntity<BaseResponse<Iterable<Product>>> getProduct(){
		Iterable<Product> viewProducts = psi.viewProducts();
		BaseResponse<Iterable<Product>> br=new BaseResponse<Iterable<Product>>(200, new Date(), "Everything is lookin Good 👍", viewProducts);
		return new ResponseEntity<BaseResponse<Iterable<Product>>>(br, HttpStatus.OK);
	}
	
	
	@PutMapping("/updatePro/{productId}")
	public ResponseEntity<BaseResponse<Product>> updatePro(@RequestBody Product p, @PathVariable int productId){
		 Product pp = psi.updatePro(p, productId);
		 BaseResponse<Product> br=new BaseResponse<Product>(201, new Date(), "Data Added", pp);
		 return new ResponseEntity<BaseResponse<Product>>(br, HttpStatus.CREATED);
	}
	
	@DeleteMapping("/deletePro/{productId}")
	public ResponseEntity<BaseResponse<Product>> deleteProduct(@RequestBody Product pro, @PathVariable int productId){
		System.out.println("In delete");
		psi.deletePro(pro, productId);
		BaseResponse<Product> br=new BaseResponse<Product>(200, new Date(), "Deleted", null);
		return new ResponseEntity<BaseResponse<Product>>(br,HttpStatus.OK);
	}
	
	@GetMapping("/getSingleProduct/{productId}")
	public ResponseEntity<BaseResponse<Product>> getSingleProduct(@PathVariable int productId){
		System.out.println(productId);
		Product pro = psi.getProduct(productId);
		BaseResponse<Product> br=new BaseResponse<Product>(200,	new Date(), "Everything is Looking Good",pro);
		return new ResponseEntity<BaseResponse<Product>>(br, HttpStatus.OK);
	
	}	
	

	
}








