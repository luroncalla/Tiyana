package com.certus.Tiyana.Controller;

import com.certus.Tiyana.Entity.CuentaEntity;
import com.certus.Tiyana.Service.CuentaService;
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
@RequestMapping("/Cuenta")

public class CuentaController {
    
    @Autowired
    private CuentaService cuentaservice;
    
    @GetMapping
    public List<CuentaEntity> findAll(){
        return cuentaservice.findAll();
    }
            
    @GetMapping("/custom")
    public List<CuentaEntity> findAllCustom(){
        return cuentaservice.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<CuentaEntity> findAllById(@PathVariable Long id){
        return cuentaservice.findById(id);
    }
    
    @PostMapping    
    public CuentaEntity add(@RequestBody CuentaEntity c){
        return cuentaservice.add(c);
    }
    
    @PutMapping("/{id}")    
     public CuentaEntity update(@PathVariable long id, @RequestBody CuentaEntity c){
         c.setNum_cuenta(id);
         return cuentaservice.update(c);
     }
    
    @DeleteMapping("/{id}")    
    public CuentaEntity delete(@PathVariable long id, @RequestBody CuentaEntity c){
        CuentaEntity objCuenta = new CuentaEntity();
        objCuenta.setEstado(false);
        return cuentaservice.delete(CuentaEntity.builder().num_cuenta(id).build());
    }
    
}

