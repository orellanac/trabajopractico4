package org.trabajopractico4.aulataller;

import javax.persistence.*;

import org.openxava.annotations.*;

@Entity
public class Aulataller {
 @Column (length=22)@Required	
  private String nombre_aulataller;

public String getNombre_aulataller() {
	return nombre_aulataller;
}

public void setNombre_aulataller(String nombre_aulataller) {
	this.nombre_aulataller = nombre_aulataller;
}

 
 
}
