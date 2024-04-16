package com.api.apirest1.service.Impl;

import com.api.apirest1.model.Persona;

import java.util.List;

public interface PersonaServiceImpl {
    List<Persona> personas();
    void guardarPersona(Persona persona);
    void eliminarPersona(int idpersona);
    void actualizarPersona(int idpersona);
}
