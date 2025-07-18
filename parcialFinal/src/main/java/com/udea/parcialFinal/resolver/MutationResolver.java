package com.udea.parcialFinal.resolver;

import com.udea.parcialFinal.model.*;
import com.udea.parcialFinal.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class MutationResolver {

    @Autowired
    private PacienteRepository pacienteRepository;

    @Autowired
    private DoctorRepository doctorRepository;

    @Autowired
    private HistoriaClinicaRepository historiaClinicaRepository;

    @MutationMapping
    public HistoriaClinica registrarHistoria(@Argument HistoriaClinicaInput input) {
        // Guardar paciente
        Paciente paciente = new Paciente(
                input.getPaciente().getCedula(),
                input.getPaciente().getNombre(),
                input.getPaciente().getApellido(),
                input.getPaciente().getEdad(),
                input.getPaciente().getGenero()
        );
        pacienteRepository.save(paciente);

        // Guardar doctor
        Doctor doctor = new Doctor(
                input.getDoctor().getCedulaProfesional(),
                input.getDoctor().getNombre(),
                input.getDoctor().getEspecialidad()
        );
        doctorRepository.save(doctor);

        // Guardar historia clínica
        HistoriaClinica historia = new HistoriaClinica();
        historia.setMotivoConsulta(input.getMotivoConsulta());
        historia.setDiagnostico(input.getDiagnostico());
        historia.setTratamiento(input.getTratamiento());
        historia.setFecha(LocalDate.parse(input.getFecha()));
        historia.setPaciente(paciente);
        historia.setDoctor(doctor);

        return historiaClinicaRepository.save(historia);
    }
}
