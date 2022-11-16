package com.certus.Tiyana.Entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity(name="CuentaEntity")
@Table(name="Cuenta")

public class CuentaEntity implements Serializable{
    
    private static final long serialVersionUID=1L;
    
    @Id
    @Column(name="num_cuenta")
    private long num_cuenta;
    
    @Column(name="tipo")
    private String tipo;
    
    @Column(name="balance")
    private double balance;
    
    @Column(name="estado")
    private boolean estado;
    
    @ManyToOne
    @JoinColumn(name="num_tarj", nullable = false)
    TarjetaEntity num_tarj;
    
}
