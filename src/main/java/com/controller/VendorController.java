package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.domain.Vendor;
import com.domain.VendorComment;
import com.domain.insurance;
import com.repo.Repository;
import com.service.VendorService;


@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/vendor")
public class VendorController {
	
	
	
	
	@Autowired
	private  VendorService vendorService;
	@RequestMapping(value="/getAll")
	public @ResponseBody List<Vendor> findAll() {
		List<Vendor> users=vendorService.findAllusers();
		for( Vendor ven: users){
	    	System.out.println(ven.getClient());
		}
		return users;
	}
	
	@RequestMapping("/getVendor")
	 @ResponseBody
	 public Vendor findById(@RequestParam("vendor_id") int vendorId){
		 	return vendorService.find(vendorId); 
	 }
	
	
	@RequestMapping(value = "/update", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)	
	@ResponseBody
	public String update(@RequestBody Vendor vendor) {
		 
	    try {	    
	    	Vendor updatedVendor=vendorService.save(vendor);	      
    	
	    }
	    catch (Exception ex) {
	      return "Error creating the user: " + ex.toString();
	    }
	    return "Updated Successfully ";
		
		
		
	}
	
	@RequestMapping(value = "/reg", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	
	@ResponseBody
	public String register(@RequestBody Vendor vendor) {
		 
	    try {	    
	    	Vendor updatedVendor=vendorService.save(vendor);	      
    	
	    }
	    catch (Exception ex) {
	      return "Error creating the user: " + ex.toString();
	    }
	    return "Registered Successfully ";
		
		
		
	}
	
	@RequestMapping("/deleteVendor")
	 @ResponseBody
	 public String deleteById(@RequestParam("vendor_id") int vendorId){
		try {	    
				vendorService.delete(vendorId);
    	
	    }
	    catch (Exception ex) {
	      return "Error deleting the vendor: " + ex.toString();
	    }
	    return "vendor deleted successfully ";
}
	
	@RequestMapping("/vendorcomments")
		@ResponseBody
		public List<VendorComment> vendorComments(@RequestParam("vendor_id") int vendorId) {
			try {
				System.out.println("first" + vendorId);
				return vendorService.findAllComments(vendorId);

			} catch (Exception ex) {
				return null;
			}

		}
		
		
		@RequestMapping(value = "/regComment", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
		@ResponseBody
		public String registerComment(@RequestBody VendorComment vendorComment) {
			 
		    try {	    
		    	vendorService.save(vendorComment);	      
	    	
		    }
		    catch (Exception ex) {
		      return "Error creating the user: " + ex.toString();
		    }
		    return "Registered Successfully ";
			
			
			
		}
	
}
