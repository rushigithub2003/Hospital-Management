package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "StaffT")
public class Staff {
	@Id
	private int sId;
	private int contact_No;
	private String f_Name, l_Name, address, email, d_joing, designation, depart_Name;

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public int getContact_No() {
		return contact_No;
	}

	public void setContact_No(int contact_No) {
		this.contact_No = contact_No;
	}

	public String getF_Name() {
		return f_Name;
	}

	public void setF_Name(String f_Name) {
		this.f_Name = f_Name;
	}

	public String getL_Name() {
		return l_Name;
	}

	public void setL_Name(String l_Name) {
		this.l_Name = l_Name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getD_joing() {
		return d_joing;
	}

	public void setD_joing(String d_joing) {
		this.d_joing = d_joing;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDepart_Name() {
		return depart_Name;
	}

	public void setDepart_Name(String depart_Name) {
		this.depart_Name = depart_Name;
	}

}
