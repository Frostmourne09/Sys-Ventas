package com.sysventas.model;

import jakarta.validation.constraints.Email;
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
public class Proveedor {
    private Long idProveedor;

    @NotBlank(message = "El DNI/RUC es obligatorio")
    @Pattern(regexp = "\\d{8}|\\d{11}", message = "El DNI debe tener 8 digitos o el RUC 11 digitos")
    private String dniruc;

    @NotBlank(message = "La razon social/nombres es obligatoria")
    @Size(max = 200, message = "La razon social/nombres no puede superar los 200 caracteres")
    private String nombresRaso;

    @NotBlank(message = "El tipo de documento es obligatorio")
    private String tipoDoc;

    @Pattern(regexp = "\\d{9}", message = "El celular debe tener 9 digitos")
    private String celular;

    @Email(message = "El correo electronico no tiene un formato valido")
    private String email;

    @NotBlank(message = "La direccion es obligatoria")
    @Size(max = 200, message = "La direccion no puede superar los 200 caracteres")
    private String direccion;
}
