package com.sysventas.model;

import com.sysventas.enums.Menus;
import com.sysventas.enums.TipoTab;

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
public class Acceso {

    @NotBlank(message = "El id de acceso es obligatorio")
    private String idAcceso;

    @NotBlank(message = "La url de acceso es obligatoria")
    @Size(max = 200, message = "La url de acceso no puede superar los 200 caracteres")
    private String urlAcceso;

    @NotBlank(message = "El nombre del item de menu es obligatorio")
    @Size(max = 100, message = "El nombre del item de menu no puede superar los 100 caracteres")
    private String menuItemNombre;

    @NotNull(message = "El menu es obligatorio")
    private Menus menuNombre;

    @NotNull(message = "El tipo de tab es obligatorio")
    private TipoTab nombreTab;
}
