package com.udea.parcialFinal.repository;

import com.udea.parcialFinal.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, String> {
}