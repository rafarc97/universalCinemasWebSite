package com.universalcinemas.application.data.user;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
	Optional<User> findByEmail(String email);
	
	Optional<User> findByName(String name);

	Optional<User> findById(Integer id);

	long countByPlan_Id(Integer id);
}