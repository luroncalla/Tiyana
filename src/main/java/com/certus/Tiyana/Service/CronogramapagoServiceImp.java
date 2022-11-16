package com.certus.Tiyana.Service;

import com.certus.Tiyana.Entity.CronogramapagoEntity;
import com.certus.Tiyana.Repository.CronogramapagoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CronogramapagoServiceImp implements CronogramapagoService{

    @Autowired
    private CronogramapagoRepository cronogramapagorepositorio;
    
    @Override
    public List<CronogramapagoEntity> findAll() {
        return cronogramapagorepositorio.findAll();
    }

    @Override
    public Optional<CronogramapagoEntity> findById(long id) {
        return cronogramapagorepositorio.findById(id);
    }

    @Override
    public List<CronogramapagoEntity> findAllCustom() {
        return cronogramapagorepositorio.findAllCustom();
    }

    @Override
    public CronogramapagoEntity add(CronogramapagoEntity c) {
        return cronogramapagorepositorio.save(c);
    }

    @Override
    public CronogramapagoEntity update(CronogramapagoEntity c) {
        CronogramapagoEntity objCronogramapago = cronogramapagorepositorio.getById(c.getId_pago());
        BeanUtils.copyProperties(c, objCronogramapago);
        return cronogramapagorepositorio.save(objCronogramapago);
    }

    @Override
    public CronogramapagoEntity delete(CronogramapagoEntity c) {
        CronogramapagoEntity objCronogramapago = cronogramapagorepositorio.getById(c.getId_pago());
        objCronogramapago.setEstado(false);
        return cronogramapagorepositorio.save(objCronogramapago);
    }
    
}
