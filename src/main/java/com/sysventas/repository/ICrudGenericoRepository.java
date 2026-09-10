package com.sysventas.repository;

import java.util.List;
import java.util.Optional;

/**
 * Contrato generico para las operaciones CRUD (Crear, Leer, Actualizar, Eliminar)
 * que debe implementar el repositorio de cada entidad del modelo.
 *
 * @param <T>  tipo de la entidad (por ejemplo Producto, Cliente, Usuario)
 * @param <ID> tipo del identificador de la entidad (por ejemplo Long, String)
 */
public interface ICrudGenericoRepository<T, ID> {

    T save(T entity);
    T update(T entity);
    Optional<T>findById(ID id);
    List<T> findAll();
    void deleteById(ID id);
    boolean existsById(ID id);
}
