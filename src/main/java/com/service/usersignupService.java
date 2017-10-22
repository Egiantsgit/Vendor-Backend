package com.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.repo.usersignupRepository;
import com.domain.UserSignup;



@Service
public class usersignupService {

	@Autowired
    private usersignupRepository usersignupRepository;
	
	public UserSignup save(UserSignup patient){
        return usersignupRepository.save(patient);
    }
	
	
	
	
}
