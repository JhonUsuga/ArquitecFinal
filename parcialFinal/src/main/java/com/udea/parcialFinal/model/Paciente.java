package com.udea.parcialFinal.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Paciente {

    @Id
    private String cedula;

    private String nombre;
    private String apellido;
    private int edad;
    private String genero;
}

