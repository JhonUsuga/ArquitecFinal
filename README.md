# ParcialFinalArquitec

Este proyecto implementa un sistema de historias clínicas usando **GraphQL**, **Spring Boot** y **PostgreSQL**, permitiendo registrar pacientes, doctores e historias clínicas, así como consultarlas por diferentes criterios.

---

## Queries disponibles

### Consulta todas las historias clínicas registradas
```graphql
query {
  obtenerHistorias {
    id
    motivoConsulta
    diagnostico
    tratamiento
    fecha
    paciente {
      nombre
      apellido
    }
    doctor {
      nombre
      especialidad
    }
  }
}


Consulta una historia clínica específica por su ID:
query {
  obtenerHistoriaPorId(id: 1) {
    motivoConsulta
    paciente {
      nombre
    }
  }
}

Consulta todas las historias asociadas a un paciente usando su cédula:
query {
  obtenerHistoriasPorCedula(cedula: "1234567890") {
    motivoConsulta
    fecha
  }
}

Consulta todos los pacientes registrados:
query {
  obtenerPacientes {
    cedula
    nombre
    apellido
  }
}

Consulta todos los doctores registrados:
query {
  obtenerDoctores {
    cedulaProfesional
    nombre
    especialidad
  }
}

# Mutaciones disponibles

Registrar Historia Clínica:
Esta mutación registra un nuevo paciente, un doctor, y una historia clínica asociada a ambos
mutation {
  registrarHistoria(input: {
    motivoConsulta: "Dolor abdominal",
    diagnostico: "Gastritis",
    tratamiento: "Omeprazol 20mg por 7 días",
    fecha: "2025-07-18",
    paciente: {
      cedula: "1234567890",
      nombre: "Juan",
      apellido: "Pérez",
      edad: 30,
      genero: "Masculino"
    },
    doctor: {
      cedulaProfesional: "MED001",
      nombre: "Dra. María López",
      especialidad: "Gastroenterología"
    }
  }) {
    id
    motivoConsulta
    paciente {
      nombre
    }
    doctor {
      nombre
    }
  }
}

Registrar un Paciente:
mutation {
  registrarPaciente(input: {
    cedula: "9876543210",
    nombre: "Laura",
    apellido: "Martínez",
    edad: 27,
    genero: "Femenino"
  }) {
    nombre
    cedula
  }
}

Registrar un Doctor:
mutation {
  registrarDoctor(input: {
    cedulaProfesional: "MED002",
    nombre: "Dr. Carlos Ruiz",
    especialidad: "Neurología"
  }) {
    nombre
    especialidad
  }
}

