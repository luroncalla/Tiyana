package com.certus.Tiyana.Controller;

import com.certus.Tiyana.Entity.TransaccionesEntity;
import com.certus.Tiyana.Service.TransaccionesService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Transacciones")

public class TransaccionesController {
    
    @Autowired
    private TransaccionesService transaccionesservice;
    
    @GetMapping
    public List<TransaccionesEntity> findAll(){
        return transaccionesservice.findAll();
    }
    
    @GetMapping("/custom")
    public List<TransaccionesEntity> findAllCustom(){
        return transaccionesservice.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<TransaccionesEntity> findById(@PathVariable Long id){
        return transaccionesservice.findById(id);
    }
    
    @PostMapping
    public TransaccionesEntity add(@RequestBody TransaccionesEntity c){
        return transaccionesservice.add(c);
    }
    
    @PutMapping("/{id}")
    public TransaccionesEntity update(@PathVariable long id, @RequestBody TransaccionesEntity c){
        c.setCod_transaccion(id);
        return transaccionesservice.update(c);
    }
            
    @DeleteMapping("/{id}")
    public TransaccionesEntity delete(@PathVariable long id, @RequestBody TransaccionesEntity c){
        TransaccionesEntity objTransacciones = new TransaccionesEntity();
        objTransacciones.setEstado(false);
        return transaccionesservice.delete(TransaccionesEntity.builder().cod_transaccion(id).build());
    }
    
}
