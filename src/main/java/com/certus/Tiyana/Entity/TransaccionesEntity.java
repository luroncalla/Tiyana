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

@Entity(name="TransaccionesEntity")
@Table(name="Transacciones")

public class TransaccionesEntity implements Serializable{
        private static final long serialVersionUID=1L;
        
        @Id
        @Column(name="cod_transaccion")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long cod_transaccion;
        
        @Column(name="fecha_transac")
        private Date fecha_trabsac;
                
        @Column(name="monto")
        private double monto;
                
        @Column(name="tipo_oper")
        private String tipo_oper;
                
        @Column(name="cuenta_dest")
        private int cuenta_dest;
        
        @Column(name="estado")
        private boolean estado;
        
        @ManyToOne
        @JoinColumn(name="num_tarj", nullable = false)
        TarjetaEntity num_tarj;
}
