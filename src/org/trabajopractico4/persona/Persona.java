package org.trabajopractico4.persona;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.trabajopractico4.escuela.*;
@MappedSuperclass
@Entity
public class Persona {
 @Column (length=11)@Required
 private String nombre_persona;

  public String getNombre_persona() {
	 return nombre_persona;
   }

   public void setNombre_persona(String nombre_persona) {
	   this.nombre_persona = nombre_persona;
    }
   
   @OneToMany (mappedBy="persona")
 private Collection <Escuela> escuela;

public Collection<Escuela> getEscuela() {
	return escuela;
}

public void setEscuela(Collection<Escuela> escuela) {
	this.escuela = escuela;
}
   
   
   
 
}
