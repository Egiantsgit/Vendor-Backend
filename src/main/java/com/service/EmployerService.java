package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.Employer;
import com.repo.EmployerRepository;

@Service
public class  EmployerService {
	@Autowired
	private EmployerRepository employerrepository;

	
	public Employer find(int employer_id){
		Employer employer = employerrepository.find(employer_id);
		return employer;
	}

}