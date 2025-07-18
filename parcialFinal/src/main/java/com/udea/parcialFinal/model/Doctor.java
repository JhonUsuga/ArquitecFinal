package com.udea.parcialFinal.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Doctor {

    @Id
    private String cedulaProfesional;

    private String nombre;
    private String especialidad;
}
