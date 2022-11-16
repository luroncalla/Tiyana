package com.certus.Tiyana.Repository;

import com.certus.Tiyana.Entity.CronogramapagoEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface CronogramapagoRepository extends JpaRepository<CronogramapagoEntity, Long>{
    @Query("select c from CronogramapagoEntity c where c.estado='1'")
    List<CronogramapagoEntity> findAllCustom();
}
