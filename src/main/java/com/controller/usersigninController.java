package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.DAO.PatientDAO;
import com.IDAO.IPatientDAO;
import com.domain.Employer;
import com.domain.UserSignup;
import com.domain.Vendor;
import com.repo.EmployerRepository;
import com.repo.usersigninRepository;
import com.service.EmployerService;
import com.service.usersignupService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/user")
public class usersigninController {
	
	@Autowired
	private usersigninRepository patientDAO;
	
	@Autowired
	private usersignupService usersignupService;

	@Autowired
	private EmployerService employerservice;
	 @RequestMapping("/login")
	 @ResponseBody
	 public UserSignup findByName(@RequestParam("username") String username,@RequestParam("password") String password){
		 	return patientDAO.find(username,password); 
	 }
	 
	 @RequestMapping("/getEmployer")
	 @ResponseBody
	 public Employer findById(@RequestParam("employer_id") int employer_id) {

			return employerservice.find(employer_id);

	}

	@RequestMapping(value = "/update", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String update(@RequestBody UserSignup user) {

			try {
				UserSignup updateuser = usersignupService.save(user);

			} catch (Exception ex) {
				return "Error creating the user: " + ex.toString();
			}
			return "Updated Successfully ";

	}
	
	@RequestMapping("/getUser")
	@ResponseBody
	public UserSignup findByEmail(@RequestParam("email") String email){
	//return patientDAO.find(username,password); 
		System.out.println("Email: "+email);
	return patientDAO.findByEmail(email);
	}
}
