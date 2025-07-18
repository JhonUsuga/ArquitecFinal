package com.udea.parcialFinal.resolver;

import com.udea.parcialFinal.model.*;
import com.udea.parcialFinal.repository.*;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.Argument;

import java.util.List;

@Component
public class QueryResolver {

    @Autowired
    private HistoriaClinicaRepository historiaClinicaRepository;

    @Autowired
    private PacienteRepository pacienteRepository;

    @Autowired
    private DoctorRepository doctorRepository;

    @QueryMapping
    public List<HistoriaClinica> obtenerHistorias() {
        return historiaClinicaRepository.findAll();
    }

    @QueryMapping
    public HistoriaClinica obtenerHistoriaPorId(@Argument Long id) {
        return historiaClinicaRepository.findById(id).orElse(null);
    }

    @QueryMapping
    public List<HistoriaClinica> obtenerHistoriasPorCedula(@Argument String cedula) {
        return historiaClinicaRepository.findByPacienteCedula(cedula);
    }

    @QueryMapping
    public List<Paciente> obtenerPacientes() {
        return pacienteRepository.findAll();
    }

    @QueryMapping
    public List<Doctor> obtenerDoctores() {
        return doctorRepository.findAll();
    }

    @QueryMapping
    public String hello() {
        return "Hola desde GraphQL";
    }
}