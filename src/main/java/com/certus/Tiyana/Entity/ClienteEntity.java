package com.certus.Tiyana.Entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
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

@Entity(name="ClienteEntity")
@Table(name="Cliente")

public class ClienteEntity implements Serializable{
    private static final long serialVersionUID=1L;
    
    @Id
    @Column(name="dni")
    private long dni;
    
    @Column(name="nombre")
    private String nombre;
    
    @Column(name="apellido")
    private String apellido;
    
    @Column(name="estado")
    private boolean estado;
  
}
