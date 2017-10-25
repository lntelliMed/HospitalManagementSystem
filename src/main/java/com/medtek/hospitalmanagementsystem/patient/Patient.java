package com.medtek.hospitalmanagementsystem.patient;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import com.medtek.hospitalmanagementsystem.model.Address;
import com.medtek.hospitalmanagementsystem.model.Billing;
import com.medtek.hospitalmanagementsystem.model.Department;
import com.medtek.hospitalmanagementsystem.model.Diagnosis;
import com.medtek.hospitalmanagementsystem.model.Doctor;
import com.medtek.hospitalmanagementsystem.model.Insurance;
import com.medtek.hospitalmanagementsystem.model.Medication;
import com.medtek.hospitalmanagementsystem.model.Nurse;
import com.medtek.hospitalmanagementsystem.model.Room;

@Entity
public class Patient {
	@Id
	@GeneratedValue
	int id;
	String name;
	Date dateOfBirth;
	char gender;
	String bloodType;
	String alergies;
	String notes;

	Date admissionDate;
	Date dischargeDate;
	
	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
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



	public String getBloodType() {
		return bloodType;
	}



	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}



	public String getAlergies() {
		return alergies;
	}



	public void setAlergies(String alergies) {
		this.alergies = alergies;
	}



	public String getNotes() {
		return notes;
	}



	public void setNotes(String notes) {
		this.notes = notes;
	}



	public Date getAdmissionDate() {
		return admissionDate;
	}



	public void setAdmissionDate(Date admissionDate) {
		this.admissionDate = admissionDate;
	}



	public Date getDischargeDate() {
		return dischargeDate;
	}



	public void setDischargeDate(Date dischargeDate) {
		this.dischargeDate = dischargeDate;
	}



	public Patient(String name, Date dateOfBirth, char gender, String bloodType, String alergies, String notes,
			Date admissionDate, Date dischargeDate) {
		super();
		//this.id = id;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.bloodType = bloodType;
		this.alergies = alergies;
		this.notes = notes;
		this.admissionDate = admissionDate;
		this.dischargeDate = dischargeDate;
	}



	public Patient() {
	}
//	
//	//@Autowired
//	private Billing billing;
//	//@Autowired
//	private Address address;
//	
//	//@Autowired
//	private Department department;
//	//@Autowired
//	private Room room;
//	
//	
//	//@Autowired
//	private Doctor doctor;
//	//@Autowired
//	private Nurse nurse;
//	//@Autowired
//	private Diagnosis diagnosis;
//	//@Autowired
//	private Insurance insurance;
//	//@Autowired
//	private Medication medication;

	
	
	
}
