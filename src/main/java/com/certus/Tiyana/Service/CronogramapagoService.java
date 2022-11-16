package com.certus.Tiyana.Service;

import com.certus.Tiyana.Entity.CronogramapagoEntity;
import java.util.List;
import java.util.Optional;


public interface CronogramapagoService {
    
    public List<CronogramapagoEntity> findAll();
    
    public Optional<CronogramapagoEntity> findById(long id);
    
    public List<CronogramapagoEntity> findAllCustom();
    
    //CRUD
    
    public CronogramapagoEntity add(CronogramapagoEntity c);
    
    public CronogramapagoEntity update(CronogramapagoEntity c);
    
    public CronogramapagoEntity delete(CronogramapagoEntity c);
}
