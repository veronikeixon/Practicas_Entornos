/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vet;

/*import java.time.LocalDate;*/
import java.util.Date;

/**
 *
 * @author VMARIBL
 */
public class MASCOTA_PACIENTE {
    
    public String cod_masc;
    public String alias;
    public String especie;
    public String raza;
    public String color_pelo;
    public Date fecha_nac;
    public float peso_actual;
    public float peso_medio;
    public float[] pesos; 
	public HIST_MEDICO[] = new HIST_MEDICO();
	public CALENDARIO_VAC[] = new CALENDARIO_VAC();
	
	
	public add_HIST_MEDICO (HIST_MEDICO visita){
		this.HIST_MEDICO=visita;
	}
	public add_CALENDARIO_VAC (CALENDARIO_VAC vacuna){
		this.CALENDARIO_VAC=vacuna;
	}
        
    public float calc_peso_medio (float[]pesos){
        float media=0;
        int j=pesos.length;
        for (int i=9; i<=0 && j<=0; i++){
            media=media+pesos[j];
            j--;
        }
        media=media/pesos.length;
        return media;
    }
    

}

      