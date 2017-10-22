package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.domain.Provider;
import com.repo.ProviderRepository;
@Configuration
@RestController
@RequestMapping("/provider")

public class ProviderController {

	
	
		
		@Autowired
		private ProviderRepository providerDAO;
		

		
		@RequestMapping("/login1")
		 @ResponseBody
		 public Provider findByName(@RequestParam("firstName") String firstName){
			 	return providerDAO.find(firstName); 
		 }

}

	

	
