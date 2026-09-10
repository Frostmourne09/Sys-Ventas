package com.sysventas.repository;

import com.sysventas.model.Cliente;

public class ClienteRepository extends AbastractJpaRepository<Cliente, String> {

    @Override
    protected String getId(Cliente entity) {
        return entity.getDniruc();
    }

    @Override
    protected void setId(Cliente entity, String id) {
        entity.setDniruc(id);
    }

    @Override
    protected String generateId() {
        // dniruc es una clave de negocio (DNI o RUC), debe asignarse
        // explicitamente al crear el Cliente, no se genera automaticamente.
        throw new UnsupportedOperationException("El DNI/RUC debe asignarse explicitamente");
    }
}
