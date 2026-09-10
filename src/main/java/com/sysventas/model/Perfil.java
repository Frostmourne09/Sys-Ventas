package com.sysventas.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.validation.Valid;
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
public class Perfil {
    private Long idPerfil;

    @NotBlank(message = "El nombre del perfil es obligatorio")
    @Size(max = 100, message = "El nombre del perfil no puede superar los 100 caracteres")
    private String nombre;

    @NotBlank(message = "El codigo del perfil es obligatorio")
    @Size(max = 20, message = "El codigo del perfil no puede superar los 20 caracteres")
    private String codigo;

    @Valid
    private List<Acceso> accesos = new ArrayList<>();
}
