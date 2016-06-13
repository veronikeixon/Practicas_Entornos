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
public class HIST_MEDICO {

    LocalDate fecha_visita;
    ENFERMEDAD enfermedad;
    
    public add_enfermedad(ENFERMEDAD enfermedad){
		this.ENFERMEDAD=enfermedad;
	}
	
	public HIST_MEDICO(LocalDate fecha_visita, ENFERMEDAD enfermedad) {
        this.fecha_visita = fecha_visita;
        this.enfermedad = enfermedad;
    }
    
        
    public void addVisita(LocalDate fecha_visita, ENFERMEDAD enfermedad) {
        this.fecha_visita = fecha_visita;
        this.enfermedad = enfermedad;
    }
    public void delVisita(LocalDate fecha_visita, ENFERMEDAD enfermedad) {

    }


    public void setFecha_visita(LocalDate fecha_visita) {
        this.fecha_visita = fecha_visita;
    }

    public void setEnfermedad(ENFERMEDAD enfermedad) {
        this.enfermedad = enfermedad;
    }

    public LocalDate getFecha_visita() {
        return fecha_visita;
    }

    public ENFERMEDAD getEnfermedad() {
        return enfermedad;
    }
    
    
    
    
}
