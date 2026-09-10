package com.sysventas.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Compra {
    private Long idCompra;

    @NotNull(message = "La fecha de compra es obligatoria")
    @PastOrPresent(message = "La fecha de compra no puede ser futura")
    private LocalDate fechaComp;

    @NotNull(message = "La fecha de registro es obligatoria")
    @PastOrPresent(message = "La fecha de registro no puede ser futura")
    private LocalDate fechaReg;

    @NotNull(message = "El proveedor es obligatorio")
    @Valid
    private Proveedor idProveedor;

    @NotNull(message = "El usuario es obligatorio")
    @Valid
    private Usuario idUsuario;

    @NotEmpty(message = "La compra debe tener al menos un detalle")
    @Valid
    private List<CompraDetalle> detalleCompra = new ArrayList<>();

    public double calcularTotal() {
        return detalleCompra.stream()
                .mapToDouble(CompraDetalle::getSubtotal)
                .sum();
    }
}
