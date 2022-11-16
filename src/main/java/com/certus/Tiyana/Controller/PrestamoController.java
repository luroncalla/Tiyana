package com.certus.Tiyana.Controller;

import com.certus.Tiyana.Entity.PrestamoEntity;
import com.certus.Tiyana.Service.PrestamoService;
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
@RequestMapping("/Prestamo")

public class PrestamoController {
    
    @Autowired
    private PrestamoService prestamoservice;
    
    @GetMapping
    public List<PrestamoEntity> findAll(){
        return prestamoservice.findAll();
    }
    
    @GetMapping("/custom")
    public List<PrestamoEntity> findAllCustom(){
        return prestamoservice.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<PrestamoEntity> findById(@PathVariable Long id){
        return prestamoservice.findById(id);
    }
    
    @PostMapping
    public PrestamoEntity add(@RequestBody PrestamoEntity c){
        return prestamoservice.add(c);
    }
    
    @PutMapping("/{id}")
    public PrestamoEntity update(@PathVariable long id, @RequestBody PrestamoEntity c){
        c.setCod_prestamo(id);
        return prestamoservice.update(c);
    }
            
    @DeleteMapping("/{id}")
    public PrestamoEntity delete(@PathVariable long id, @RequestBody PrestamoEntity c){
        PrestamoEntity objPrestamo = new PrestamoEntity();
        objPrestamo.setEstado(false);
        return prestamoservice.delete(PrestamoEntity.builder().cod_prestamo(id).build());
    }
    
}
