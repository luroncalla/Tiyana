package com.certus.Tiyana.Service;

import com.certus.Tiyana.Entity.ClienteEntity;
import java.util.List;
import java.util.Optional;


public interface ClienteService {
    
    public List<ClienteEntity> findAll();
    
    public Optional<ClienteEntity> findById(long id);
    
    public List<ClienteEntity> findAllCustom();
    
    //CRUD
    
    public ClienteEntity add(ClienteEntity c);
           
    public ClienteEntity update(ClienteEntity c);
            
    public ClienteEntity delete(ClienteEntity c);
    
}
