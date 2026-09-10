package com.sysventas.model;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CompCarrito {
    private Long idCompcarrito;

    @NotBlank(message = "El nombre del producto es obligatorio")
    private String nombreProducto;

    @NotNull(message = "La cantidad es obligatoria")
    @Positive(message = "La cantidad debe ser mayor a cero")
    private Double cantidad;

    @NotNull(message = "El precio unitario es obligatorio")
    @Positive(message = "El precio unitario debe ser mayor a cero")
    private Double punitario;

    @NotNull(message = "El precio total es obligatorio")
    @PositiveOrZero(message = "El precio total no puede ser negativo")
    private Double ptotal;

    private int estado;

    @NotNull(message = "El proveedor es obligatorio")
    @Valid
    private Proveedor idProveedor;

    @NotNull(message = "El producto es obligatorio")
    @Valid
    private Producto idProducto;

    @NotNull(message = "El usuario es obligatorio")
    @Valid
    private Usuario idUsuario;
}
