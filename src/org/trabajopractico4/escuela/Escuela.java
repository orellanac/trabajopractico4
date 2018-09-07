package org.trabajopractico4.escuela;


import javax.persistence.*;

import org.openxava.annotations.*;
import org.trabajopractico4.aula.*;
import org.trabajopractico4.gestion.*;
import org.trabajopractico4.gimnasio.*;
import org.trabajopractico4.materia.*;
import org.trabajopractico4.persona.*;
import org.trabajopractico4.programa.*;
import org.trabajopractico4.regencia.*;

@Entity
public class Escuela extends Gestion{
//atributos 
  @Column (length=22)@Required
  private String nombre_escuela;
 
  public String getNombre_escuela() {
	 return nombre_escuela;
   }

public void setNombre_escuela(String nombre_escuela) {
	this.nombre_escuela = nombre_escuela;
}

@ManyToOne
  private Materia materia;
public Materia getMateria() {
	return materia;
}

public void setMateria(Materia materia) {
	this.materia = materia;
}


@ManyToOne 
private Gimnasio gimnasio;

public Gimnasio getGimnasio() {
	return gimnasio;
}

public void setGimnasio(Gimnasio gimnasio) {
	this.gimnasio = gimnasio;
}
@ManyToOne
private Programa programa;

public Programa getPrograma() {
	return programa;
}

public void setPrograma(Programa programa) {
	this.programa = programa;
}
@ManyToOne
private Regencia regencia;
public Regencia getRegencia() {
	return regencia;
  } 

public void setRegencia(Regencia regencia) {
	this.regencia = regencia;
 }
@ManyToOne
private Aula aula;
public Aula getAula() {
	return aula;
}

public void setAula(Aula aula) {
	this.aula = aula;
}
@ManyToOne 
private Persona persona;

public Persona getPersona() {
	return persona;
}

public void setPersona(Persona persona) {
	this.persona = persona;
}

 	
}
