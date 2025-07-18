package com.udea.parcialFinal.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HistoriaClinica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String motivoConsulta;
    private String diagnostico;
    private String tratamiento;
    private LocalDate fecha;

    @ManyToOne
    private Paciente paciente;

    @ManyToOne
    private Doctor doctor;
}
