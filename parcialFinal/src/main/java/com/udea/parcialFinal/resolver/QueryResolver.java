package com.udea.parcialFinal.resolver;

import com.udea.parcialFinal.model.HistoriaClinica;
import com.udea.parcialFinal.repository.HistoriaClinicaRepository;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.Argument;

import java.util.List;

@Component
public class QueryResolver {

    @Autowired
    private HistoriaClinicaRepository historiaClinicaRepository;

    @QueryMapping
    public List<HistoriaClinica> obtenerHistoriasPorCedula(@Argument String cedula) {
        return historiaClinicaRepository.findByPacienteCedula(cedula);
    }
}
