package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Doctor;
import com.example.demo.Repository.DoctorRepository;

/**
 * Admin Controller Services:
 * 
 * 1.Save Doctor; 2.Retrieve Doctor by id; 3.Delete Doctor by id; 4.Delete All
 * Doctors;
 */
@Service
public class DoctorService {
	@Autowired
	DoctorRepository dr;

	public void saveDoctor(Doctor d) {
		dr.save(d);

	}

	public Doctor viewDoctor(int dId) {
		return dr.findById(dId).get();
	}

	public void deleteDoctorById(int dId) {
		dr.deleteById(dId);

	}

	public void deleteAllDoctor() {
		dr.deleteAll();

	}
}
