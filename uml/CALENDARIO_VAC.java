/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vet;

import java.time.LocalDate;

/**
 *
 * @author VMARIBL
 */
public class CALENDARIO_VAC {
    
    LocalDate fecha_vac;
    ENFERMEDAD enfermedad;

	public add_enfermedad(ENFERMEDAD enfermedad){
		this.ENFERMEDAD=enfermedad;
	}
	
    public CALENDARIO_VAC(LocalDate fecha_vac, ENFERMEDAD enfermedad) {
        this.fecha_vac = fecha_vac;
        this.enfermedad = enfermedad;
    }
    
    public void addVACUNA(LocalDate fecha_vac, ENFERMEDAD enfermedad) {
        this.fecha_vac = fecha_vac;
        this.enfermedad = enfermedad;
    }
    public void delVACUNA(LocalDate fecha_vac, ENFERMEDAD enfermedad) {

    }

    public void setFecha_vac(LocalDate fecha_vac) {
        this.fecha_vac = fecha_vac;
    }

    public void setEnfermedad(ENFERMEDAD enfermedad) {
        this.enfermedad = enfermedad;
    }
    
    public LocalDate getFecha_vac() {
        return fecha_vac;
    }

    public ENFERMEDAD getEnfermedad() {
        return enfermedad;
    }

    
    
}
