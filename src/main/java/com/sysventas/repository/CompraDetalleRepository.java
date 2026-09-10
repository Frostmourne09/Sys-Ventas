package com.sysventas.repository;

import com.sysventas.model.CompraDetalle;

public class CompraDetalleRepository extends AbastractJpaRepository<CompraDetalle, Long> {

    private long sequence = 1;

    @Override
    protected Long getId(CompraDetalle entity) {
        return entity.getIdCompraDetalle();
    }

    @Override
    protected void setId(CompraDetalle entity, Long id) {
        entity.setIdCompraDetalle(id);
    }

    @Override
    protected Long generateId() {
        return sequence++;
    }
}
