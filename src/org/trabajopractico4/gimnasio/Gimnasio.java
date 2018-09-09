package org.trabajopractico4.gimnasio;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.trabajopractico4.escuela.*;

@Entity
public class Gimnasio {
     @Column (length=11)@Required
	private String nombre_gim;
     

	public String getNombre_gim() {
		return nombre_gim;
	}

	public void setNombre_gim(String nombre_gim) {
		this.nombre_gim = nombre_gim;
	}
	@Column (length=11) @Required
	private String nombre_cliente;
	
    public String getNombre_cliente() {
		return nombre_cliente;
	}

	public void setNombre_cliente(String nombre_cliente) {
		this.nombre_cliente = nombre_cliente;
	}
	@Column (length=11) @Required
	private String tipo_pagos;
	
	public String getTipo_pagos() {
		return tipo_pagos;
	}

	public void setTipo_pagos(String tipo_pagos) {
		this.tipo_pagos = tipo_pagos;
	}
	
	@OneToMany (mappedBy="gimnasio")
private Collection <Escuela> escuela;

public Collection<Escuela> getEscuela() {
	return escuela;
}

public void setEscuela(Collection<Escuela> escuela) {
	this.escuela = escuela;
}
	
    
} 
