package com.certus.Tiyana.Controller;

import com.certus.Tiyana.Entity.CronogramapagoEntity;
import com.certus.Tiyana.Service.CronogramapagoService;
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
@RequestMapping("/Cronogramapago")

public class CronogramapagoController {
    
    @Autowired
    private CronogramapagoService cronogramapagoservice;
    
    @GetMapping
    public List<CronogramapagoEntity> findAll(){
        return cronogramapagoservice.findAll();
    }
    
    @GetMapping("/custom")
    public List<CronogramapagoEntity> findAllCustom(){
        return cronogramapagoservice.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<CronogramapagoEntity> findById(@PathVariable Long id){
        return cronogramapagoservice.findById(id);
    }
    
    @PostMapping
    public CronogramapagoEntity add(@RequestBody CronogramapagoEntity c){
        return cronogramapagoservice.add(c);
    }
    
    @PutMapping("/{id}")
    public CronogramapagoEntity update(@PathVariable long id, @RequestBody CronogramapagoEntity c){
        c.setId_pago(id);
        return cronogramapagoservice.update(c);
    }
    
    @DeleteMapping("/{id}")
    public CronogramapagoEntity delete(@PathVariable long id, @RequestBody CronogramapagoEntity c){
        CronogramapagoEntity objCronogramapago = new CronogramapagoEntity();
        objCronogramapago.setEstado(false);
        return cronogramapagoservice.delete(CronogramapagoEntity.builder().id_pago(id).build());
    }
    
}
