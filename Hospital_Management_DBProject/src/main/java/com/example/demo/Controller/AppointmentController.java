package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Appointment;
import com.example.demo.Service.AppointmentService;

/**
 * 
 * Attributes:-
 * 
 * int aId,pId,dId; String ap_Date,ap_Time,reason_F_Visit,status;
 * 
 * Admin Controller Services:
 * 
 * 1.Save Appointment; 2.Retrieve Appointment by id; 3.Delete Appointment by id;
 * 4.Delete All Appointment;
 */

@RestController
public class AppointmentController {
	@Autowired
	AppointmentService as;

	@PostMapping("Appointment")
	String addAppointment(@RequestBody Appointment a) {
		as.saveAppointment(a);
		return "Appointment Added";

	}

	@GetMapping("Appointment/{aId}")
	Appointment getAppointment(@PathVariable int aId) {
		return as.viewAppointment(aId);
		// return null;

	}

	@DeleteMapping("Appointment/{aId}")
	String deleteAppointment(@PathVariable int aId) {
		return "Appointment Deleted";
	}

	@DeleteMapping("Appointment")
	String deleteAllAppointment() {
		return "All Appointment Deleted";
	}
}
