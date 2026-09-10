package com.sysventas.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Venta extends DocumentoComercial {

    @NotNull(message = "La fecha de generacion es obligatoria")
    @PastOrPresent(message = "La fecha de generacion no puede ser futura")
    private LocalDateTime fechaGener;

    @NotNull(message = "El cliente es obligatorio")
    @Valid
    private Cliente dniruc;

    @NotNull(message = "El usuario es obligatorio")
    @Valid
    private Usuario idUsuario;

    @NotEmpty(message = "La venta debe tener al menos un detalle")
    @Valid
    private List<VentaDetalle> detalleVenta = new ArrayList<>();

    public Venta() {
        super();
    }

    public Venta(Long id, double precioBase, double igv, double precioTotal, String serie,
            String numDoc, String tipoDoc, LocalDateTime fechaGener, Cliente dniruc,
            Usuario idUsuario, List<VentaDetalle> detalleVenta) {
        super(id, precioBase, igv, precioTotal, serie, numDoc, tipoDoc);
        this.fechaGener = fechaGener;
        this.dniruc = dniruc;
        this.idUsuario = idUsuario;
        this.detalleVenta = detalleVenta;
    }

    @Override
    public double calcularTotal() {
        double total = detalleVenta.stream()
                .mapToDouble(VentaDetalle::getSubtotal)
                .sum();
        setPrecioTotal(total);
        return total;
    }
}
