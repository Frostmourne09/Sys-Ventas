package com.sysventas.repository;

import com.sysventas.model.Emisor;

public class EmisorRepository extends AbastractJpaRepository<Emisor, Long> {

    private long sequence = 1;

    @Override
    protected Long getId(Emisor entity) {
        return entity.getIdEmisor();
    }

    @Override
    protected void setId(Emisor entity, Long id) {
        entity.setIdEmisor(id);
    }

    @Override
    protected Long generateId() {
        return sequence++;
    }
}
