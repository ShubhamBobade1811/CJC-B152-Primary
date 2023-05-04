package com.mian.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mian.model.Details;

@Repository
public interface FormRepos extends JpaRepository<Details, Integer>{

}
