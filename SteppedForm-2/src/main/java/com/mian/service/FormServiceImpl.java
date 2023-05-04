package com.mian.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.mian.model.Details;
import com.mian.repos.FormRepos;

@Service
public class FormServiceImpl implements FormServiceI {
	
	@Autowired
	FormRepos pr;

	@Override
	@PostMapping("/savePersonDetails")
	public Details saveData(Details details) {
		
		Details details2 = pr.save(details);
		return details2;
	}


	
	


}
