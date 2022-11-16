package com.certus.Tiyana.Entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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

@Entity(name="TarjetaEntity")
@Table(name="Tarjeta")

public class TarjetaEntity implements Serializable{
    private static final long serialVersionUID=1L;
    
    @Id
    @Column(name="num_tarj")
    private long num_tarj;
    
    @Column(name="tipo_tarj")
    private String tipo_tarj;
     
    @Column(name="fecha_afi")
    private Date fecha_afi;
    
    @Column(name="fecha_cad")
    private Date fecha_cad;
    
    @Column(name="saldo")
    private double saldo;
    
    @Column(name="estado")
    private boolean estado;
    
    @ManyToOne
    @JoinColumn(name="cliente_dni", nullable = false)
    ClienteEntity cliente_dni;
    
}