package com.sysventas.repository;

import com.sysventas.model.Perfil;

public class PerfilRepository extends AbastractJpaRepository<Perfil, Long> {

    private long sequence = 1;

    @Override
    protected Long getId(Perfil entity) {
        return entity.getIdPerfil();
    }

    @Override
    protected void setId(Perfil entity, Long id) {
        entity.setIdPerfil(id);
    }

    @Override
    protected Long generateId() {
        return sequence++;
    }
}
