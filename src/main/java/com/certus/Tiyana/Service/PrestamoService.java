package com.certus.Tiyana.Service;

import com.certus.Tiyana.Entity.PrestamoEntity;
import java.util.List;
import java.util.Optional;


public interface PrestamoService {
    
    public List<PrestamoEntity> findAll();
    
    public Optional<PrestamoEntity> findById(long id);
    
    public List<PrestamoEntity> findAllCustom();
    
    
    //CRUD
    
    public PrestamoEntity add(PrestamoEntity c);
    
    public PrestamoEntity update(PrestamoEntity c);
    
    public PrestamoEntity delete(PrestamoEntity c);
}
