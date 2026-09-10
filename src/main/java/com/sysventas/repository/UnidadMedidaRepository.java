package com.sysventas.repository;

import com.sysventas.model.UnidMedida;

public class UnidadMedidaRepository extends AbastractJpaRepository<UnidMedida, Long> {

    private long sequence = 1;

    @Override
    protected Long getId(UnidMedida entity) {
        return entity.getIdUnidad();
    }

    @Override
    protected void setId(UnidMedida entity, Long id) {
        entity.setIdUnidad(id);
    }

    @Override
    protected Long generateId() {
        return sequence++;
    }
    
}
