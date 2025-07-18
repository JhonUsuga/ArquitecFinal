package com.udea.parcialFinal.repository;

import com.udea.parcialFinal.model.HistoriaClinica;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HistoriaClinicaRepository extends JpaRepository<HistoriaClinica, Long> {
    List<HistoriaClinica> findByPacienteCedula(String cedula);
}
