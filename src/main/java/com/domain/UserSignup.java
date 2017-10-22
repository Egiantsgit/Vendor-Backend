package com.domain;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user_signup")
public class UserSignup {
	
	@Id
    @Column(name="userid")
	private int userid;
	@Column(name="username")
	private String username;
	@Column(name="password")
	private String password;
	@Column(name="firstname")
	private String firstname;
	@Column(name="lastname")
	private String lastname;
	@Column(name="email")
	private String email;
	@Column(name="phonenumber")
	private String phonenumber;
	@Column(name="role")
	private String role;
	@Column(name="upload")
	private String upload;
	@Column(name="universityname")
	private String universityname;
	@Column(name="cityname")
	private String cityname;
	@Column(name="dob")
	private String dob;
	@Column(name="major")
	private String major;
	@Column(name="employer_id")
	private int employer_id;
	
	public UserSignup() {
		super();
	
	}
	
	public int getEmployer_id() {
		return employer_id;
	}


	public void setEmployer_id(int employer_id) {
		this.employer_id = employer_id;
	}


	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}


	public String getMajor() {
		return major;
	}


	public void setMajor(String major) {
		this.major = major;
	}


	public String getCityname() {
		return cityname;
	}


	public void setCityname(String cityname) {
		this.cityname = cityname;
	}


	public String getUniversityname() {
		return universityname;
	}


	public void setUniversityname(String universityname) {
		this.universityname = universityname;
	}
	
	public int getuserId() {
		return userid;
	}
	public void setuserId(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	public String getUpload() {
		return upload;
	}


	public void setUpload(String upload) {
		this.upload = upload;
	}
}