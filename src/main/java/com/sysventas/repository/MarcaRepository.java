package com.sysventas.repository;

import com.sysventas.model.Marca;

public class MarcaRepository extends AbastractJpaRepository<Marca, Long> {
    private long sequence = 1;

    @Override 
    protected Long getId(Marca entity) {
        return entity.getIdMarca();
    }

    @Override
    protected void setId(Marca entity, Long id) {
        entity.setIdMarca(id);
    }

    @Override
    protected Long generateId() {
        return sequence++;
    }
}
