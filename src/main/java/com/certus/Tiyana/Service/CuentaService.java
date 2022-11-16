package com.certus.Tiyana.Service;

import com.certus.Tiyana.Entity.CuentaEntity;
import java.util.List;
import java.util.Optional;


public interface CuentaService {
    
    public List<CuentaEntity> findAll();
    
    public Optional<CuentaEntity> findById(long id);
    
    public List<CuentaEntity> findAllCustom();
    
    //CRUD
    
    public CuentaEntity add(CuentaEntity c);
    
    public CuentaEntity update(CuentaEntity c);
    
    public CuentaEntity delete(CuentaEntity c);
    
}
