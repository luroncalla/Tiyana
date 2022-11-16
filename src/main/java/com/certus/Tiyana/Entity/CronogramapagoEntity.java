package com.certus.Tiyana.Entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity(name="CronogramapagoEntity")
@Table(name="Cronogramapago")

public class CronogramapagoEntity implements Serializable{
    private static final long serialVersionUID=1L;
    
    @Id
    @Column(name="id_pago")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_pago;
    
    @Column(name="cant_cuotas")
    private int cant_cuotas;
    
    @Column(name="deuda")
    private double deuda;
    
    @Column(name="pago")
    private double pago;
    
    @Column(name="saldo")
    private double saldo;
    
    @Column(name="interes")
    private double interes;
    
    @Column(name="estado")
    private boolean estado;

    
    
}
