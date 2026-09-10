package com.sysventas.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Emisor {
    private Long idEmisor;

    @NotBlank(message = "El RUC es obligatorio")
    @Pattern(regexp = "\\d{11}", message = "El RUC debe tener 11 digitos")
    private String ruc;

    @NotBlank(message = "El nombre comercial es obligatorio")
    @Size(max = 200, message = "El nombre comercial no puede superar los 200 caracteres")
    private String nombreComercial;

    @NotBlank(message = "El ubigeo es obligatorio")
    @Pattern(regexp = "\\d{6}", message = "El ubigeo debe tener 6 digitos")
    private String ubigeo;

    @NotBlank(message = "El domicilio fiscal es obligatorio")
    @Size(max = 200, message = "El domicilio fiscal no puede superar los 200 caracteres")
    private String domicilioFiscal;

    @Size(max = 100, message = "La urbanizacion no puede superar los 100 caracteres")
    private String urbanizacion;

    @NotBlank(message = "El departamento es obligatorio")
    @Size(max = 100, message = "El departamento no puede superar los 100 caracteres")
    private String departamento;

    @NotBlank(message = "La provincia es obligatoria")
    @Size(max = 100, message = "La provincia no puede superar los 100 caracteres")
    private String provincia;

    @NotBlank(message = "El distrito es obligatorio")
    @Size(max = 100, message = "El distrito no puede superar los 100 caracteres")
    private String distrito;
}
