package com.mian.controller;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mian.model.Details;
import com.mian.service.FormServiceI;


@CrossOrigin("*")
@RestController
public class FormController {


	@Autowired
	FormServiceI psi;
	
	@PostMapping("/savePersonDetails")
	public Details save(@RequestBody Details details) {
	    Details d =	psi.saveData(details);
		return d;
	}
	
	
	
}
