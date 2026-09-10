package com.sysventas.repository;

import com.sysventas.model.VentCarrito;

public class VentCarritoRepository extends AbastractJpaRepository<VentCarrito, Long> {

    private long sequence = 1;

    @Override
    protected Long getId(VentCarrito entity) {
        return entity.getIdCarrito();
    }

    @Override
    protected void setId(VentCarrito entity, Long id) {
        entity.setIdCarrito(id);
    }

    @Override
    protected Long generateId() {
        return sequence++;
    }
}
