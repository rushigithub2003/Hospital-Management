package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Doctor;
import com.example.demo.Service.DoctorService;

/**
 * 
 * Attributes- int dId,exp; String name,address,email,spl;
 * 
 * Admin Controller Services:
 * 
 * 1.Save Doctor; 2.Retrieve Doctor by id; 3.Delete Doctor by id; 4.Delete All
 * Doctors;
 */

@RestController
public class DoctorController {
	@Autowired
	DoctorService ds;

	@PostMapping("Doctor")
	String addDoctor(@RequestBody Doctor d) {
		ds.saveDoctor(d);
		return "Doctor added";
	}

	@GetMapping("Doctor/{dId}")
	Doctor getDoctor(@PathVariable int dId) {
		return ds.viewDoctor(dId);

	}

	@DeleteMapping("deleteDoctor/{dId}")
	String deleteDoctor(@PathVariable int dId) {
		ds.deleteDoctorById(dId);
		return "Doctor Deleted";
	}

	@DeleteMapping("deleteAllDoctor")
	String deleteAllDoctor() {
		ds.deleteAllDoctor();
		return "All Doctor are Deleted";
	}
}
