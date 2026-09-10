package com.sysventas.repository;

import com.sysventas.model.Acceso;

public class AccesoRepository extends AbastractJpaRepository<Acceso, String> {

    @Override
    protected String getId(Acceso entity) {
        return entity.getIdAcceso();
    }

    @Override
    protected void setId(Acceso entity, String id) {
        entity.setIdAcceso(id);
    }

    @Override
    protected String generateId() {
        // idAcceso es una clave de negocio (codigo de acceso), debe asignarse
        // explicitamente al crear el Acceso, no se genera automaticamente.
        throw new UnsupportedOperationException("El id de acceso debe asignarse explicitamente");
    }
}
