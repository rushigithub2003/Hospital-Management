package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Patient;
import com.example.demo.Service.PatientService;

/**
 * 
 * Attributes:- int pId,age,contact_No; String
 * f_Name,l_Name,address,deasis,gender;
 * 
 * Admin Controller Services:
 * 
 * 1.Save Patient; 2.Retrieve Patient by id; 3.Delete Patient by id; 4.Delete
 * All Patient;
 */
@RestController
public class PatientController {
	@Autowired
	PatientService ps;

	@PostMapping("Patient")
	String addPatient(@RequestBody Patient p) {
		ps.savePatient(p);
		return "Patient Added";

	}

	@GetMapping("Patient/{pId}")
	Patient getPatient(@PathVariable int pId) {
		return ps.viewPatient(pId);

	}

	@DeleteMapping("Patient/{dId}")
	String deletePatient(@PathVariable int pId) {
		ps.deletePatient(pId);
		return "Patient Deleted";

	}

	@DeleteMapping("Patient")
	String deleteAllPatient() {
		ps.deleteAllPatient();
		return "All Patient Data Deleted";

	}

}
