package com.restapi.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restapi.user.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
}