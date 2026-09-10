package com.sysventas.repository;

import com.sysventas.model.Venta;

public class VentaRepository extends AbastractJpaRepository<Venta, Long> {

    private long sequence = 1;

    @Override
    protected Long getId(Venta entity) {
        return entity.getId();
    }

    @Override
    protected void setId(Venta entity, Long id) {
        entity.setId(id);
    }

    @Override
    protected Long generateId() {
        return sequence++;
    }
}
