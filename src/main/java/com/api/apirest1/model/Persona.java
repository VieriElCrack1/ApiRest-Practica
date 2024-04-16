package com.api.apirest1.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_persona")
public class Persona {
    @Id
    @NotNull(message = "El Id No debe ser Null")
    private Integer idpersona;
    @NotEmpty(message = "Campo Requerido")
    @Column(columnDefinition = "varchar(50)")
    private String nompersona;
    @NotEmpty(message = "Campo Requerido")
    @Column(columnDefinition = "varchar(50)")
    private String apepersona;
    @Column(unique = true, length = 8, columnDefinition = "varchar(8)")
    @NotEmpty(message = "Digite Su Dni")
    @Size(max = 8, min = 8, message = "Formato Incoorrecto")
    private String dnipersona;
}
