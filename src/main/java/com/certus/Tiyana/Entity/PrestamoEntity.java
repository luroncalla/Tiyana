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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity(name="PrestamoEntity")
@Table(name="Prestamo")

public class PrestamoEntity implements Serializable{
    private static final long serialVersionUID=1L;
    
    @Id
    @Column(name="cod_prestamo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long cod_prestamo;
    
    @Column(name="fecha_prest")
    private Date fecha_prest;
    
    @Column(name="fecha_venc")
    private Date fecha_venc;
    
    @Column(name="cuenta_dest")
    private int cuenta_dest;
    
    @Column(name="estado")
    private boolean estado;
    
    @OneToOne
    @JoinColumn(name="cronograma_pago", nullable = false)
    CronogramapagoEntity cronograma_pago;
    
    @ManyToOne
    @JoinColumn(name="num_tarjeta", nullable = false)
    TarjetaEntity num_tarjeta;
}
