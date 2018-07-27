package org.trabajopractico4.aula;

import javax.persistence.*;

import org.openxava.annotations.*;
@MappedSuperclass
@Entity
public class Aula {
@Column(length=11)@Required
private String nombre_aula;

public String getNombre_aula() {
	return nombre_aula;
}

public void setNombre_aula(String nombre_aula) {
	this.nombre_aula = nombre_aula;
}

}
