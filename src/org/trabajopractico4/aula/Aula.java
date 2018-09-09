package org.trabajopractico4.aula;

import java.util.*;
import javax.persistence.*;
import org.openxava.annotations.*;
import org.trabajopractico4.escuela.*;
@MappedSuperclass
@Entity
public class Aula {
@Column(length=11)@Required
private String nombre_aula;

public String getNombre_aula() {
	return nombre_aula;
}

@Column(length=11) @Required
private String tipo_aula;

public String getTipo_aula() {
	return tipo_aula;
}

public void setTipo_aula(String tipo_aula) {
	this.tipo_aula = tipo_aula;
}

public void setNombre_aula(String nombre_aula) {
	this.nombre_aula = nombre_aula;
}
@Column (length=11) @Required
private int capacidad;

public int getCapacidad() {
	return capacidad;
}

public void setCapacidad(int capacidad) {
	this.capacidad = capacidad;
}

@OneToMany(mappedBy="aula")
private Collection <Escuela> escuela;

public Collection<Escuela> getEscuela() {
	return escuela;
}

public void setEscuela(Collection<Escuela> escuela) {
	this.escuela = escuela;
}
}
