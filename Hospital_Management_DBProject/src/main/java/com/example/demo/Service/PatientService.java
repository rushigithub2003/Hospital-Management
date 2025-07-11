package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Patient;
import com.example.demo.Repository.PaitentRepository;

/**
 * Admin Controller Services:
 * 
 * 1.Save Patient; 2.Retrieve Patient by id; 3.Delete Patient by id; 4.Delete
 * All Patient;
 */
@Service
public class PatientService {
	@Autowired
	PaitentRepository pr;

	public void savePatient(Patient p) {
		pr.save(p);

	}

	public Patient viewPatient(int pId) {
		return pr.findById(pId).get();

	}

	public void deletePatient(int pId) {
		pr.deleteById(pId);

	}

	public void deleteAllPatient() {
		pr.deleteAll();

	}

}
