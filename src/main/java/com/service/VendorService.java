package com.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.Vendor;
import com.domain.VendorComment;
import com.repo.VendorCommentsRepository;
import com.repo.VendorRepository;

@Service
public class VendorService {
	@Autowired
	private VendorRepository vendorRepository;
	
	@Autowired
	private VendorCommentsRepository vendorCommentsRepository;
	
	public List<Vendor> findAllusers(){
		
		List<Vendor> vendors = (List<Vendor>) vendorRepository.findAll();
		return vendors;
	}
	
	public Vendor find(int vendor_id){
		Vendor vendor = vendorRepository.find(vendor_id);
		return vendor;
	}
	
	public Vendor save(Vendor vendor){
	Vendor vendor1=vendorRepository.save(vendor);
		return vendor1;
	}
	
	public void delete(int vendor_id){
		vendorRepository.delete(vendor_id);
	}
	
	public List<VendorComment> findAllComments(int vendor_id){
		
		List<VendorComment> vendorComments = (List<VendorComment>) vendorCommentsRepository.findAll(vendor_id);
		for (Iterator iterator = vendorComments.iterator(); iterator.hasNext();) {
			VendorComment vendorComment = (VendorComment) iterator.next();
			System.out.println(vendorComment.getComment_id());			
		}
		return vendorComments;
	}
	
	public void save(VendorComment vendorComment){
	 vendorCommentsRepository.save(vendorComment);
	}
}
