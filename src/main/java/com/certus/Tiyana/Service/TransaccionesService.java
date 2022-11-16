package com.certus.Tiyana.Service;

import com.certus.Tiyana.Entity.TransaccionesEntity;
import java.util.List;
import java.util.Optional;


public interface TransaccionesService {
    
    public List<TransaccionesEntity> findAll();
    
    public Optional<TransaccionesEntity> findById(long id);
    
    public List<TransaccionesEntity> findAllCustom();
    
    //CRUD
    
    public TransaccionesEntity add(TransaccionesEntity c);
    
    public TransaccionesEntity update(TransaccionesEntity c);

    public TransaccionesEntity delete(TransaccionesEntity c);

}
