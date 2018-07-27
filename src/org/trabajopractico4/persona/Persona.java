package org.trabajopractico4.persona;

import javax.persistence.*;

import org.openxava.annotations.*;
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
 
}
