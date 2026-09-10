package com.sysventas.repository;

import com.sysventas.model.VentaDetalle;

public class VentaDetalleRepository extends AbastractJpaRepository<VentaDetalle, Long> {

    private long sequence = 1;

    @Override
    protected Long getId(VentaDetalle entity) {
        return entity.getIdVentaDetalle();
    }

    @Override
    protected void setId(VentaDetalle entity, Long id) {
        entity.setIdVentaDetalle(id);
    }

    @Override
    protected Long generateId() {
        return sequence++;
    }
}
