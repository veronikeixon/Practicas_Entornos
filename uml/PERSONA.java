/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vet;

/**
 *
 * @author VMARIBL
 */
public class PERSONA {
    
    String dni;
    String nombre;
    
    public PERSONA(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }
    
    public void addPERSONA(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

public void delPERSONA(String dni, String nombre) {

    }

    
    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }
}
