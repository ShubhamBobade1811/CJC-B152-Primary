package com.mian.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mian.model.Supplier;
import com.mian.repos.SupRepos;

@Service
public class SupServiceImpl implements SupServiceI{

	@Autowired
	SupRepos sr;
	
	@Override
	public Supplier addSuuplier(Supplier s) {
		
		Supplier save = sr.save(s);
		return save;
		
	}

	@Override
	public Iterable<Supplier> getSupplier() {
		Iterable<Supplier> findAll = sr.findAll();
		return findAll;
	}

}
