package com.certus.Tiyana.Service;

import com.certus.Tiyana.Entity.TarjetaEntity;
import com.certus.Tiyana.Repository.TarjetaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TarjetaServiceImp implements TarjetaService{
    
    @Autowired
    private TarjetaRepository tarjetarepositorio;
     
    @Override
    public List<TarjetaEntity> findAll() {
        return tarjetarepositorio.findAll();
    }

    @Override
    public Optional<TarjetaEntity> findById(long id) {
        return tarjetarepositorio.findById(id);
    }

    @Override
    public List<TarjetaEntity> findAllCustom() {
        return tarjetarepositorio.findAllCustom();
    }

    @Override
    public TarjetaEntity add(TarjetaEntity c) {
        return tarjetarepositorio.save(c);
    }

    @Override
    public TarjetaEntity update(TarjetaEntity c) {
        TarjetaEntity objTarjeta = tarjetarepositorio.getById(c.getNum_tarj());
        BeanUtils.copyProperties(c, objTarjeta);
        return tarjetarepositorio.save(objTarjeta);
    }

    @Override
    public TarjetaEntity delete(TarjetaEntity c) {
        TarjetaEntity objTarjeta = tarjetarepositorio.getById(c.getNum_tarj());
        objTarjeta.setEstado(false);
        return tarjetarepositorio.save(objTarjeta);
    }
    
}
