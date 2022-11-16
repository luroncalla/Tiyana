package com.certus.Tiyana.Service;

import com.certus.Tiyana.Entity.TarjetaEntity;
import java.util.List;
import java.util.Optional;


public interface TarjetaService {
    
    public List<TarjetaEntity> findAll();
    
    public Optional<TarjetaEntity> findById(long id);
    
    public List<TarjetaEntity> findAllCustom();
    
    //CRUD
    
    public TarjetaEntity add(TarjetaEntity c);
    
    public TarjetaEntity update(TarjetaEntity c);
    
    public TarjetaEntity delete(TarjetaEntity c);
    
}
