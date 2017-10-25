package com.medtek.hospitalmanagementsystem.model;

import java.util.Date;

//import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	//@Id
	private int id;
	private String firstName;
	private String middleName;
	private String lastName;
	private String role;
	private Date dateOfBirth;
	private char gender;
	private String notes;	
	
	//@Autowired
	private Address address;
	//@Autowired
	private Department department;
	
	
	public Employee(int id, String firstName, String middleName, String lastName, String role, Date dateOfBirth,
			char gender, String notes, Address address, Department department) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.role = role;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.notes = notes;
		this.address = address;
		this.department = department;
	}
	
	public Employee(){
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName="
				+ lastName + ", role=" + role + ", dateOfBirth=" + dateOfBirth + ", gender=" + gender + ", notes="
				+ notes + ", address=" + address + ", department=" + department + "]";
	}
	

}
