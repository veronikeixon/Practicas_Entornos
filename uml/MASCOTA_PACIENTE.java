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
    
    String cod_masc;
    String alias;
    String especie;
    String raza;
    String color_pelo;
    Date fecha_nac;
    float peso_actual;
    float peso_medio;
    float[] pesos; 

    public MASCOTA_PACIENTE(String cod_masc, String alias, String especie, String raza, String color_pelo, float peso_actual) {
        this.cod_masc = cod_masc;
        this.alias = alias;
        this.especie = especie;
        this.raza = raza;
        this.color_pelo = color_pelo;
        this.peso_actual=peso_actual;
        this.peso_medio=Promedio(pesos);
    }

        public void addMascota (String cod_masc, String alias, String especie, String raza, String color_pelo, float peso_actual) {
        this.cod_masc = cod_masc;
        this.alias = alias;
        this.especie = especie;
        this.raza = raza;
        this.color_pelo = color_pelo;
        this.peso_actual=peso_actual;
        this.peso_medio=Promedio(pesos);
    }

public void delMascota (String cod_masc) {
        
    }
        
    public void setCod_masc(String cod_masc) {
        this.cod_masc = cod_masc;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setColor_pelo(String color_pelo) {
        this.color_pelo = color_pelo;
    }

    public void setFecha_nac(Date fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public void setPeso_actual(float peso_actual) {
        this.peso_actual = peso_actual;
    }


    public String getCod_masc() {
        return cod_masc;
    }

    public String getAlias() {
        return alias;
    }

    public String getEspecie() {
        return especie;
    }

    public String getRaza() {
        return raza;
    }

    public String getColor_pelo() {
        return color_pelo;
    }

    public Date getFecha_nac() {
        return fecha_nac;
    }

    public float getPeso_actual() {
        return peso_actual;
    }

    public float getPeso_medio() {
        return peso_medio;
    }
        
    public float Promedio (float[]pesos){
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

      