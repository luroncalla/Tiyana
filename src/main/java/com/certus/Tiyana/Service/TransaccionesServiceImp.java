package com.certus.Tiyana.Service;

import com.certus.Tiyana.Entity.TransaccionesEntity;
import com.certus.Tiyana.Repository.TransaccionesRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransaccionesServiceImp implements TransaccionesService{

    @Autowired
    private TransaccionesRepository transaccionesrepositorio;
    
    @Override
    public List<TransaccionesEntity> findAll() {
        return transaccionesrepositorio.findAll();
    }

    @Override
    public Optional<TransaccionesEntity> findById(long id) {
        return transaccionesrepositorio.findById(id);
    }

    @Override
    public List<TransaccionesEntity> findAllCustom() {
        return transaccionesrepositorio.findAllCustom();
    }

    @Override
    public TransaccionesEntity add(TransaccionesEntity c) {
        return transaccionesrepositorio.save(c);
    }

    @Override
    public TransaccionesEntity update(TransaccionesEntity c) {
        TransaccionesEntity objTransacciones = transaccionesrepositorio.getById(c.getCod_transaccion());
        BeanUtils.copyProperties(c, objTransacciones);
        return transaccionesrepositorio.save(objTransacciones);
    }

    @Override
    public TransaccionesEntity delete(TransaccionesEntity c) {
        TransaccionesEntity objTransacciones = transaccionesrepositorio.getById(c.getCod_transaccion());
        objTransacciones.setEstado(false);
        return transaccionesrepositorio.save(objTransacciones);
    }
    
}
