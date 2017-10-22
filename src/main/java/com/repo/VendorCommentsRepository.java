package com.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.domain.VendorComment;


public interface VendorCommentsRepository extends JpaRepository<VendorComment,Integer>{

	@Query("SELECT v FROM VendorComment v WHERE v.vendor_id = :vendor_id")
    public List<VendorComment> findAll(@Param("vendor_id") int vendorId);
	
}