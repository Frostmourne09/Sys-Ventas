package com.sysventas.repository;

import com.sysventas.model.Producto;

public class ProductoRepository extends AbastractJpaRepository<Producto, Long> {

    private long sequence = 1;

    @Override
    protected Long getId(Producto entity) {
        return entity.getIdProducto();
    }

    @Override
    protected void setId(Producto entity, Long id) {
        entity.setIdProducto(id);
    }

    @Override
    protected Long generateId() {
        return sequence++;
    }
}
