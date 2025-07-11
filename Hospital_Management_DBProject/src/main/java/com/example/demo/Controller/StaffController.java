package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Staff;
import com.example.demo.Service.StaffService;

/**
 * 
 * Attributes:- int sId,contact_No; String
 * f_Name,l_Name,address,email,gender,d_joing,designation,depart_Name;
 * //designation:- Nurse,Receptionist,Admin,Technician;
 * 
 * Admin Controller Services:
 * 
 * 1.Save Staff; 2.Retrieve Staff by id; 3.Delete Staff by id; 4.Delete All
 * Staff;
 */
@RestController
public class StaffController {

	@Autowired
	StaffService ss;

	@PostMapping("Staff")
	String addStaff(@RequestBody Staff s) {
		ss.saveStaff(s);
		return "Staff Added";
	}

	@GetMapping("Staff/{sId}")
	Staff getStaff(@PathVariable int sId) {
		return ss.viewStaff(sId);

	}

	@DeleteMapping("Staff/{sId}")
	String deleteStaff(@PathVariable int sId) {
		ss.deleteStaffById(sId);
		return "Staff Deleted";
	}

	@DeleteMapping("Staff")
	String deleteAllStaff(@PathVariable int sID) {
		ss.deleteAllStaff();
		return "All Staff Are Deleted";
	}

}
