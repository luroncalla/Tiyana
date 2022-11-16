package com.certus.Tiyana.Service;

import com.certus.Tiyana.Entity.PrestamoEntity;
import com.certus.Tiyana.Repository.PrestamoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrestamoServiceImp implements PrestamoService{
    
    @Autowired
    private PrestamoRepository prestamorepositorio;

    @Override
    public List<PrestamoEntity> findAll() {
        return prestamorepositorio.findAll();
    }

    @Override
    public Optional<PrestamoEntity> findById(long id) {
        return prestamorepositorio.findById(id);
    }

    @Override
    public List<PrestamoEntity> findAllCustom() {
        return prestamorepositorio.findAllCustom();
    }

    @Override
    public PrestamoEntity add(PrestamoEntity c) {
        return prestamorepositorio.save(c);
    }

    @Override
    public PrestamoEntity update(PrestamoEntity c) {
        PrestamoEntity objPrestamo = prestamorepositorio.getById(c.getCod_prestamo());
        BeanUtils.copyProperties(c, objPrestamo);
        return prestamorepositorio.save(objPrestamo);
    }

    @Override
    public PrestamoEntity delete(PrestamoEntity c) {
        PrestamoEntity objPrestamo = prestamorepositorio.getById(c.getCod_prestamo());
        objPrestamo.setEstado(false);
        return prestamorepositorio.save(objPrestamo);
    }
    
}
