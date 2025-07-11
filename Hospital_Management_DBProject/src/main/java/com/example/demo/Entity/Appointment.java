package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Appointment {
	@Id
	private int aId;
	private int pId, dId;
	private String ap_Date, ap_Time, reason_F_Visit, status;

	public int getaId() {
		return aId;
	}

	public void setaId(int aId) {
		this.aId = aId;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public int getdId() {
		return dId;
	}

	public void setdId(int dId) {
		this.dId = dId;
	}

	public String getAp_Date() {
		return ap_Date;
	}

	public void setAp_Date(String ap_Date) {
		this.ap_Date = ap_Date;
	}

	public String getAp_Time() {
		return ap_Time;
	}

	public void setAp_Time(String ap_Time) {
		this.ap_Time = ap_Time;
	}

	public String getReason_F_Visit() {
		return reason_F_Visit;
	}

	public void setReason_F_Visit(String reason_F_Visit) {
		this.reason_F_Visit = reason_F_Visit;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
