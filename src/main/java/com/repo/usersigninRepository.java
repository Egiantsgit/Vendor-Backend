package com.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.domain.UserSignup;

@Repository
public interface usersigninRepository extends JpaRepository<UserSignup, Integer> {

	//UserSignup findById(int userid);
	
	@Query("SELECT p FROM UserSignup p WHERE p.username = :username AND p.password = :password")
    public UserSignup find(@Param("username") String username,@Param("password") String password);

	@Query("SELECT p FROM UserSignup p WHERE p.email = :email")
	   public UserSignup findByEmail(@Param("email") String email);
}
