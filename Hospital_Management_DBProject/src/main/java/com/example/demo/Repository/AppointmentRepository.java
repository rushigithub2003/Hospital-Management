package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {

}
