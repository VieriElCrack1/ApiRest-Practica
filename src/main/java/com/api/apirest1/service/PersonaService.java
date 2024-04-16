package com.api.apirest1.service;

import com.api.apirest1.model.Persona;
import com.api.apirest1.repository.PersonaRepository;
import com.api.apirest1.service.Impl.PersonaServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class PersonaService implements PersonaServiceImpl{

    private PersonaRepository personaRepository;


    @Override
    public List<Persona> personas() {
        return personaRepository.findAll();
    }

    @Override
    public void guardarPersona(Persona persona) {
        personaRepository.save(persona);
    }

    @Override
    public void eliminarPersona(int idpersona) {
        personaRepository.deleteById(idpersona);
    }

    @Override
    public void actualizarPersona(int idpersona) {
        personaRepository.findById(idpersona);
    }
}
