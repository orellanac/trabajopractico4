package org.trabajopractico4.preceptor;

import javax.persistence.*;

import org.openxava.annotations.*;

@Entity
public class Preceptor {
 @Column(length=11) @Required
 private String nombre_prece;

public String getNombre_prece() {
	return nombre_prece;
}

public void setNombre_prece(String nombre_prece) {
	this.nombre_prece = nombre_prece;
}
 
}
