package com.mian.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mian.model.User;

@Repository
public interface UserRepos extends CrudRepository<User, Integer> {

}
