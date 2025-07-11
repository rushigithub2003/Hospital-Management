package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Staff;
import com.example.demo.Repository.StaffRepository;

/**
 * Admin Controller Services:
 * 
 * 1.Save Staff; 2.Retrieve Staff by id; 3.Delete Staff by id; 4.Delete All
 * Staff;
 */

@Service
public class StaffService {

	@Autowired
	StaffRepository sr;

	public void saveStaff(Staff s) {
		sr.save(s);
	}

	public Staff viewStaff(int sId) {
		return sr.findById(sId).get();
	}

	public void deleteStaffById(int sId) {
		sr.deleteById(sId);

	}

	public void deleteAllStaff() {
		sr.deleteAll();
	}
}
