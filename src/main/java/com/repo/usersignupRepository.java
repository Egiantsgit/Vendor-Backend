package com.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.domain.UserSignup;

@Repository
public interface usersignupRepository extends CrudRepository<UserSignup, Integer> {

	//public Patient findById(int id);
	
}
