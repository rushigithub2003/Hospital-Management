package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Integer> {

}
