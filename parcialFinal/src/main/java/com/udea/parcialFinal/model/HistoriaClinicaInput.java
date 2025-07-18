package com.udea.parcialFinal.model;

import lombok.Data;

@Data
public class HistoriaClinicaInput {
    private String motivoConsulta;
    private String diagnostico;
    private String tratamiento;
    private String fecha;  // formato: "YYYY-MM-DD"
    private PacienteInput paciente;
    private DoctorInput doctor;
}
