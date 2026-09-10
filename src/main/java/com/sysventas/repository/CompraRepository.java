package com.sysventas.repository;

import com.sysventas.model.Compra;

public class CompraRepository extends AbastractJpaRepository<Compra, Long> {

    private long sequence = 1;

    @Override
    protected Long getId(Compra entity) {
        return entity.getIdCompra();
    }

    @Override
    protected void setId(Compra entity, Long id) {
        entity.setIdCompra(id);
    }

    @Override
    protected Long generateId() {
        return sequence++;
    }
}
