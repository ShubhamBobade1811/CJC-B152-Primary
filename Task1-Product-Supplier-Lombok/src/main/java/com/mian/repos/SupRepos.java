package com.mian.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mian.model.Supplier;

@Repository
public interface SupRepos extends JpaRepository<Supplier, Integer>{

}
