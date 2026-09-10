package com.sysventas.model;

import com.sysventas.enums.TipoDocumento;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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
public class Cliente {

    @NotBlank(message = "El DNI/RUC es obligatorio")
    @Pattern(regexp = "\\d{8}|\\d{11}", message = "El DNI debe tener 8 digitos o el RUC 11 digitos")
    private String dniruc;

    @NotBlank(message = "El nombre es obligatorio")
    @Size(max = 200, message = "El nombre no puede superar los 200 caracteres")
    private String nombres;

    @Size(max = 200, message = "El representante legal no puede superar los 200 caracteres")
    private String repLegal;

    @NotBlank(message = "La direccion es obligatoria")
    @Size(max = 200, message = "La direccion no puede superar los 200 caracteres")
    private String direccion;

    @NotNull(message = "El tipo de documento es obligatorio")
    private TipoDocumento tipoDocumento;
}
