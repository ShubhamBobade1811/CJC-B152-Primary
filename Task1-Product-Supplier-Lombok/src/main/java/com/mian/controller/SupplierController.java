package com.mian.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mian.base_response.BaseResponse;
import com.mian.model.Supplier;
import com.mian.service.SupServiceI;

@CrossOrigin("*")
@RestController
public class SupplierController {
	

	@Autowired
	SupServiceI ssi;
	
	@PostMapping("/addSup")
	public ResponseEntity<BaseResponse<Supplier>> addSup(@RequestBody Supplier supplier){
		Supplier s = ssi.addSuuplier(supplier);
		BaseResponse<Supplier> br=new BaseResponse<Supplier>(201, new Date(), "Data Added", s);
		return new ResponseEntity<BaseResponse<Supplier>>(br, HttpStatus.CREATED);
	}
	
	
	@GetMapping("/getSup")
	public ResponseEntity<BaseResponse<Iterable<Supplier>>> getSup(){
		Iterable<Supplier> supplier = ssi.getSupplier();
		BaseResponse<Iterable<Supplier>> br=new BaseResponse<Iterable<Supplier>>(200, new Date(), "Everything is lookin Good 👍", supplier);
		return new ResponseEntity<BaseResponse<Iterable<Supplier>>>(br, HttpStatus.OK);
	}

}
