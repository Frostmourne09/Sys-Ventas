package com.service.impl;

import java.util.List;

import com.service.ICrudGenericoService;
import com.sysventas.exeption.ModelNotFoundException;
import com.sysventas.repository.ICrudGenericoRepository;

public abstract class ICrudGenericoServiceImp<T, ID> implements ICrudGenericoService<T, ID> {

    protected abstract ICrudGenericoRepository<T, ID> getRepository();

    @Override
    public T save(T t){
        return getRepository().save(t);
    }

    @Override
    public T update(ID id, T t){
        if(getRepository().findById(id).isEmpty()){
            throw new ModelNotFoundException("ID no existe: " + id);
        }
        return getRepository().update(t);
    }

    @Override
    public List<T> findAll(){
        return getRepository().findAll();
    }

    @Override
    public T findById(ID id){
        return getRepository().findById(id).orElseThrow(() -> new ModelNotFoundException("ID no existe: " + id));
    }

    @Override
    public void delete(ID id){
        if(!getRepository().existsById(id)){
            throw new ModelNotFoundException("ID no existe: " + id);
        }
        getRepository().deleteById(id);
    }

}
