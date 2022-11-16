package com.certus.Tiyana.Service;

import com.certus.Tiyana.Entity.ClienteEntity;
import com.certus.Tiyana.Repository.ClienteRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImp implements ClienteService{
    
    @Autowired
    private ClienteRepository clienterepositorio;

    @Override
    public List<ClienteEntity> findAll() {
        return clienterepositorio.findAll();
    }

    @Override
    public Optional<ClienteEntity> findById(long id) {
        return clienterepositorio.findById(id);
    }

    @Override
    public List<ClienteEntity> findAllCustom() {
        return clienterepositorio.findAllCustom();
    }

    @Override
    public ClienteEntity add(ClienteEntity c) {
        return clienterepositorio.save(c);
    }

    @Override
    public ClienteEntity update(ClienteEntity c) {
        ClienteEntity objCliente = clienterepositorio.getById(c.getDni());
        BeanUtils.copyProperties(c, objCliente);
        return clienterepositorio.save(objCliente);
    }

    @Override
    public ClienteEntity delete(ClienteEntity c) {
        ClienteEntity objCliente = clienterepositorio.getById(c.getDni());
        objCliente.setEstado(false);
        return clienterepositorio.save(objCliente);
    }
    
}
