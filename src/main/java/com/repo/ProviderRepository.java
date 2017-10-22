package com.repo;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.domain.Provider;

@Configuration
	public interface ProviderRepository extends JpaRepository<Provider, Integer> {


		
		@Query("SELECT p FROM Provider p WHERE p.firstName = :firstName")
	    public Provider find(@Param("firstName") String firstName);

}

	
	