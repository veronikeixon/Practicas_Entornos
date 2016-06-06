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
public class ENFERMEDAD {
    String nom_enf;

    public ENFERMEDAD(String nom_enf) {
        this.nom_enf = nom_enf;
    }
    public void addENFERMEDAD(String nom_enf) {
        this.nom_enf = nom_enf;
    }
    public void delENFERMEDAD(String nom_enf) {
    }

    public void setNom_enf(String nom_enf) {
        this.nom_enf = nom_enf;
    }

    public String getNom_enf() {
        return nom_enf;
    }
    
}
