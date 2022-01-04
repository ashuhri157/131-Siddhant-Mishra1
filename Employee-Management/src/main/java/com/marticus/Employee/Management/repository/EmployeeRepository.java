package com.marticus.Employee.Management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.marticus.Employee.Management.Entities.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
