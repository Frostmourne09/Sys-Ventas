package com.sysventas.repository;

import com.sysventas.model.Proveedor;

public class ProveedorRepository extends AbastractJpaRepository<Proveedor, Long> {

    private long sequence = 1;

    @Override
    protected Long getId(Proveedor entity) {
        return entity.getIdProveedor();
    }

    @Override
    protected void setId(Proveedor entity, Long id) {
        entity.setIdProveedor(id);
    }

    @Override
    protected Long generateId() {
        return sequence++;
    }
}
