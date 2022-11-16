package com.certus.Tiyana.Repository;

import com.certus.Tiyana.Entity.TransaccionesEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface TransaccionesRepository extends JpaRepository<TransaccionesEntity, Long>{
    @Query("select c from TransaccionesEntity c where c.estado='1'")
    List<TransaccionesEntity> findAllCustom();
    
}
