package com.sysventas.repository;

import com.sysventas.model.CompCarrito;

public class CompCarritoRepository extends AbastractJpaRepository<CompCarrito, Long> {

    private long sequence = 1;

    @Override
    protected Long getId(CompCarrito entity) {
        return entity.getIdCompcarrito();
    }

    @Override
    protected void setId(CompCarrito entity, Long id) {
        entity.setIdCompcarrito(id);
    }

    @Override
    protected Long generateId() {
        return sequence++;
    }
}
