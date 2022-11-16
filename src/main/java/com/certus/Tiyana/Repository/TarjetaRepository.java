package com.certus.Tiyana.Repository;

import com.certus.Tiyana.Entity.TarjetaEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface TarjetaRepository extends JpaRepository<TarjetaEntity, Long>{
    @Query("select c from TarjetaEntity c where c.estado='1'")
    List<TarjetaEntity> findAllCustom();
    
}
