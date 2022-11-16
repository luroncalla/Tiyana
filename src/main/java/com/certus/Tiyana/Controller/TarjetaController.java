package com.certus.Tiyana.Controller;

import com.certus.Tiyana.Entity.TarjetaEntity;
import com.certus.Tiyana.Service.TarjetaService;
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
@RequestMapping("/Tarjeta")

public class TarjetaController {
    
    @Autowired
    private TarjetaService tarjetaservice;
    
    @GetMapping
    public List<TarjetaEntity> findAll(){
        return tarjetaservice.findAll();
    }
    
    @GetMapping("/custom")
    public List<TarjetaEntity> findAllCustom(){
        return tarjetaservice.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<TarjetaEntity> findById(@PathVariable Long id){
        return tarjetaservice.findById(id);
    }
    
    @PostMapping
    public TarjetaEntity add(@RequestBody TarjetaEntity c){
        return tarjetaservice.add(c);
    }
    
    @PutMapping("/{id}")
    public TarjetaEntity update(@PathVariable long id, @RequestBody TarjetaEntity c){
        c.setNum_tarj(id);
        return tarjetaservice.update(c);
    }
            
    @DeleteMapping("/{id}")
    public TarjetaEntity delete(@PathVariable long id, @RequestBody TarjetaEntity c){
        TarjetaEntity objTarjeta = new TarjetaEntity();
        objTarjeta.setEstado(false);
        return tarjetaservice.delete(TarjetaEntity.builder().num_tarj(id).build());
    }
    
}
