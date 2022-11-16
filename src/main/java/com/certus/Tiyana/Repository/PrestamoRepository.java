package com.certus.Tiyana.Repository;

import com.certus.Tiyana.Entity.PrestamoEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface PrestamoRepository extends JpaRepository<PrestamoEntity, Long>{
    @Query("select c from PrestamoEntity c where c.estado='1'")
    List<PrestamoEntity> findAllCustom();
    
}
