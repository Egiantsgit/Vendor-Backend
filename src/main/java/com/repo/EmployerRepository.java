package com.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.domain.Employer;


public interface EmployerRepository extends JpaRepository<Employer, Integer> {

	@Query("SELECT p FROM Employer p WHERE p.employer_id= :employer_id")
	public Employer find(@Param("employer_id") int employer_id);
}