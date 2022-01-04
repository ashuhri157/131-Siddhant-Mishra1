package com.marticus.Employee.Management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.marticus.Employee.Management.Entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String username);

}
