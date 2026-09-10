package com.sysventas.repository;

import com.sysventas.model.Usuario;

public class UsuarioRepository extends AbastractJpaRepository<Usuario, Long> {

    private long sequence = 1;

    @Override
    protected Long getId(Usuario entity) {
        return entity.getIdUsuario();
    }

    @Override
    protected void setId(Usuario entity, Long id) {
        entity.setIdUsuario(id);
    }

    @Override
    protected Long generateId() {
        return sequence++;
    }
}
