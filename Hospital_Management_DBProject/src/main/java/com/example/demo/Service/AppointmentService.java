package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Appointment;
import com.example.demo.Repository.AppointmentRepository;

/**
 * Admin Controller Services:
 * 
 * 1.Save Appointment; 2.Retrieve Appointment by id; 3.Delete Appointment by id;
 * 4.Delete All Appointment;
 */
@Service
public class AppointmentService

{
	@Autowired
	AppointmentRepository ar;

	public void saveAppointment(Appointment a) {
		ar.save(a);
	}

	public Appointment viewAppointment(int aId) {

		return ar.findById(aId).get();
	}

	public void deleteAppointmentById(int aId) {
		ar.deleteById(aId);

	}

	public void deleteAllAppointment() {
		ar.deleteAll();
	}

}
