package com.sysventas.model;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {
    private Long idUsuario;

    @NotBlank(message = "El usuario es obligatorio")
    @Size(min = 4, max = 50, message = "El usuario debe tener entre 4 y 50 caracteres")
    private String usuario;

    @NotBlank(message = "La clave es obligatoria")
    @Size(min = 6, max = 100, message = "La clave debe tener al menos 6 caracteres")
    private String clave;

    @NotBlank(message = "El estado es obligatorio")
    private String estado;

    @NotNull(message = "El perfil es obligatorio")
    @Valid
    private Perfil idPerfil;
}
