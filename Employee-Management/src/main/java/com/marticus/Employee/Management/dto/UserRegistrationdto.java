package com.marticus.Employee.Management.dto;

public class UserRegistrationdto {
	
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private int salary;
	private int age;
	private int aadhar;
	private String Department;
	
	public UserRegistrationdto(){
		
	}
	
	public UserRegistrationdto(String firstName, String lastName, int salary, int age, int aadhar, String Department, String email, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.salary = salary;
		this.age = age;
		this.aadhar = aadhar;
		this.Department = Department;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getsalary() {
		return salary;
	}
	public void setsalary(int salary) {
		this.salary = salary;
	}
	public int getage() {
		return age;
	}
	public void setage(int age) {
		this.age = age;
	}
	public int getaadhar() {
		return aadhar;
	}
	public void setaadhar(int aadhar) {
		this.aadhar = aadhar;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String Department) {
		this.Department = Department;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
