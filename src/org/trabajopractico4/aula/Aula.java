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

public void setNombre_aula(String nombre_aula) {
	this.nombre_aula = nombre_aula;
}
@OneToMany (mappedBy="aula")
private Collection <Escuela> escuela;

public Collection<Escuela> getEscuela() {
	return escuela;
}

public void setEscuela(Collection<Escuela> escuela) {
	this.escuela = escuela;
}

}
