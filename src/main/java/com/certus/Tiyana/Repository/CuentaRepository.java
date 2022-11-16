package com.certus.Tiyana.Repository;

import com.certus.Tiyana.Entity.CuentaEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface CuentaRepository extends JpaRepository<CuentaEntity, Long>{
    @Query("select c from CuentaEntity c where c.estado='1'")
    List<CuentaEntity> findAllCustom();
}
