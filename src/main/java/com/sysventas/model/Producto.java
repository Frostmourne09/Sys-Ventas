package com.sysventas.model;

import com.sysventas.enums.TipoProducto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Producto {
    private Long idProducto;

    @NotBlank(message = "El nombre del producto es obligatorio")
    @Size(max = 150, message = "El nombre del producto no puede superar los 150 caracteres")
    private String nombre;

    @NotNull(message = "El precio unitario es obligatorio")
    @PositiveOrZero(message = "El precio unitario no puede ser negativo")
    private Double pu;

    @PositiveOrZero(message = "El precio unitario anterior no puede ser negativo")
    private Double puold;

    @PositiveOrZero(message = "La utilidad no puede ser negativa")
    private Double utilidad;

    @NotNull(message = "El stock es obligatorio")
    @PositiveOrZero(message = "El stock no puede ser negativo")
    private Double stock;

    @PositiveOrZero(message = "El stock anterior no puede ser negativo")
    private Double stockold;

    @NotNull(message = "La categoria es obligatoria")
    @Valid
    private Categoria idCategoria;

    @NotNull(message = "La marca es obligatoria")
    @Valid
    private Marca idMarca;

    @NotNull(message = "La unidad de medida es obligatoria")
    @Valid
    private UnidMedida idUnidad;

    @NotNull(message = "El tipo de producto es obligatorio")
    private TipoProducto tipoProducto;
}
