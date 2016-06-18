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
    
    public LocalDate fecha_vac;
    public ENFERMEDAD enfermedad;

	public add_enfermedad(ENFERMEDAD enfermedad){
		this.ENFERMEDAD=enfermedad;
	}    
}
