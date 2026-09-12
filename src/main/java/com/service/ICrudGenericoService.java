package com.service;

import java.util.List;

public interface ICrudGenericoService <T, ID> {
    T save(T entity);
    T update(ID id, T entity);
    List<T> findAll();
    T findById(ID id);
    void delete(ID id);
<<<<<<< HEAD
 
=======
    
    
>>>>>>> e142b720e139d97eb45e78a4779522bf10e52f25
}
