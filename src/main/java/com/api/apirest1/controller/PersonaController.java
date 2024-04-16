package com.api.apirest1.controller;

import com.api.apirest1.model.Persona;
import com.api.apirest1.service.Impl.PersonaServiceImpl;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RequestMapping("/")
@RestController
public class PersonaController {
    private PersonaServiceImpl personaService;

    @GetMapping("/listado")
    public ResponseEntity<?> listado() {
        try {
            return ResponseEntity.ok().body(personaService.personas());
        }catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error Hubo Una Excepcion : " + e.getCause().getMessage());
        }
    }

    @PostMapping("/registar")
    public ResponseEntity<?> registrar(@Valid @RequestBody Persona persona) {
        try {
            personaService.guardarPersona(persona);
            return ResponseEntity.ok().body("Se Registro Exitosamente");
        }catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error En Registrar");
        }
    }
}
