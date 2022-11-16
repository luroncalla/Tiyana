package com.certus.Tiyana.Controller;

import com.certus.Tiyana.Entity.ClienteEntity;
import com.certus.Tiyana.Service.ClienteService;
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
@RequestMapping("/Cliente")
public class ClienteController {
    
    @Autowired
    private ClienteService clienteservice;
    
    @GetMapping
    public List<ClienteEntity> findAll(){
        return clienteservice.findAll();
    }
    
    //listar los habilitados
    @GetMapping("/custom")
    public List<ClienteEntity> findAllCustom(){
        return clienteservice.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<ClienteEntity> findById(@PathVariable Long id){
        return clienteservice.findById(id);
    }
    
    //add
    @PostMapping
    public ClienteEntity add(@RequestBody ClienteEntity c){
        return clienteservice.add(c);
    }
    
    //Actualizar por código
    @PutMapping("/{id}")
    public ClienteEntity update(@PathVariable long id, @RequestBody ClienteEntity c){
        c.setDni(id);
        return clienteservice.update(c);
    }
            
    @DeleteMapping("/{id}")
    public ClienteEntity delete(@PathVariable long id){
        ClienteEntity objCliente = new ClienteEntity();
        objCliente.setEstado(false);
        return clienteservice.delete(ClienteEntity.builder().dni(id).build());
    }
    
}
