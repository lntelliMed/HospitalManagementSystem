package com.medtek.hospitalmanagementsystem.patient;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {
	@Autowired
	private PatientRepository patientRepository;
	
	public List<Patient> getAllPatients(){
		List<Patient> patients = new ArrayList<>();
		patientRepository.findAll().forEach(patients::add);
		return patients;
	}
	
	
	public Patient getPatientById(Integer id) {
		return patientRepository.findOne(id);
	}
	
	public void insertPatient(Patient patient) {
		patientRepository.save(patient);
	}

	public void updatePatient(Patient patient) {
		patientRepository.save(patient);
	}


	public void deletePatient(Integer id) {
		patientRepository.delete(id);		
	}
	
}
