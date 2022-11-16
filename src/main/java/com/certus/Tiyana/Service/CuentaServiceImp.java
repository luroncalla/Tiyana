package com.certus.Tiyana.Service;

import com.certus.Tiyana.Entity.CuentaEntity;
import com.certus.Tiyana.Repository.CuentaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CuentaServiceImp implements CuentaService{
    
    @Autowired 
    private CuentaRepository cuentarepositorio;

    @Override
    public List<CuentaEntity> findAll() {
        return cuentarepositorio.findAll();
    }

    @Override
    public Optional<CuentaEntity> findById(long id) {
        return cuentarepositorio.findById(id);
    }

    @Override
    public List<CuentaEntity> findAllCustom() {
        return cuentarepositorio.findAllCustom();
    }

    @Override
    public CuentaEntity add(CuentaEntity c) {
        return cuentarepositorio.save(c);
    }

    @Override
    public CuentaEntity update(CuentaEntity c) {
        CuentaEntity objCuenta = cuentarepositorio.getById(c.getNum_cuenta());
        BeanUtils.copyProperties(c, objCuenta);
        return cuentarepositorio.save(objCuenta);
    }

    @Override
    public CuentaEntity delete(CuentaEntity c) {
        CuentaEntity objCuenta = cuentarepositorio.getById(c.getNum_cuenta());
        objCuenta.setEstado(false);
        return cuentarepositorio.save(objCuenta);
    }
    
}
