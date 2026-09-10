package com.sysventas.repository;

import com.sysventas.model.Categoria;

public class CategoriaRepository extends AbastractJpaRepository<Categoria, Long> {

    private long sequence = 1;
    
    @Override
    protected Long getId(Categoria entity) {
        return entity.getIdCategoria();
    }

    @Override
    protected void setId(Categoria entity, Long id) {
        entity.setIdCategoria(id);
    }

    @Override
    protected Long generateId() {
        return sequence++;
    }
}
