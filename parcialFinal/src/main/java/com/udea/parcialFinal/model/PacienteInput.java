package com.udea.parcialFinal.model;

import lombok.Data;

@Data
public class PacienteInput {
    private String cedula;
    private String nombre;
    private String apellido;
    private int edad;
    private String genero;
}
