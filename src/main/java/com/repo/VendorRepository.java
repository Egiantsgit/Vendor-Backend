package com.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.domain.Vendor;
import com.domain.insurance;

public interface VendorRepository extends JpaRepository<Vendor,Integer>{

	@Query("SELECT p FROM Vendor p WHERE p.vendor_id = :vendor_id")
    public Vendor find(@Param("vendor_id") int vendorId);
	
	
	@Query("SELECT i FROM Vendor i WHERE i.username = :username")
    public Vendor find(@Param("username") String username);

}
