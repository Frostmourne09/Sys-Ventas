package com.sysventas.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UnidMedida {
    private Long idUnidad;

    @NotBlank(message = "El nombre de la unidad de medida es obligatorio")
    @Size(max = 50, message = "El nombre de la unidad de medida no puede superar los 50 caracteres")
    private String nombreMedida;
}
