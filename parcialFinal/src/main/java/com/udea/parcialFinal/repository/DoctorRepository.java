package com.udea.parcialFinal.repository;

import com.udea.parcialFinal.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, String> {
}
