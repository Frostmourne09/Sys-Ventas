package com.sysventas.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public abstract class DocumentoComercial {
    private Long id;

    @PositiveOrZero(message = "El precio base no puede ser negativo")
    private double precioBase;

    @PositiveOrZero(message = "El IGV no puede ser negativo")
    private double igv;

    @PositiveOrZero(message = "El precio total no puede ser negativo")
    private double precioTotal;

    @NotBlank(message = "La serie es obligatoria")
    private String serie;

    @NotBlank(message = "El numero de documento es obligatorio")
    private String numDoc;

    @NotBlank(message = "El tipo de documento es obligatorio")
    private String tipoDoc;

    protected DocumentoComercial(Long id, double precioBase, double igv, double precioTotal,
            String serie, String numDoc, String tipoDoc) {
        this.id = id;
        this.precioBase = precioBase;
        this.igv = igv;
        this.precioTotal = precioTotal;
        this.serie = serie;
        this.numDoc = numDoc;
        this.tipoDoc = tipoDoc;
    }

    public abstract double calcularTotal();
}
