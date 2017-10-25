package com.medtek.hospitalmanagementsystem.patient;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {
	@Autowired
	private PatientService patientService;
	
	@RequestMapping("/patients")
	public List<Patient> getAllPatients(){
		return patientService.getAllPatients();
	}
	
	@RequestMapping("/patients/{id}")
	public Patient getPatientByID(@PathVariable("id") Integer id){
		Patient patient = patientService.getPatientById(id);
		return patient;
	}
	
	
	@RequestMapping(method=RequestMethod.POST, value="/patients")
	public void insertPatient(@RequestBody Patient patient) {
		patientService.insertPatient(patient);
	}

	@RequestMapping(method=RequestMethod.PUT, value="/patients/{id}")
	public void updatePatient(@RequestBody Patient patient) {
		patientService.updatePatient(patient);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/patients/{id}")
	public void deleteatient(@PathVariable("id") Integer id) {
		patientService.deletePatient(id);
	}
}
