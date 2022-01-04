package com.marticus.Employee.Management.Service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.marticus.Employee.Management.dto.UserRegistrationdto;
import com.marticus.Employee.Management.Entities.User;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationdto registrationdto);
}