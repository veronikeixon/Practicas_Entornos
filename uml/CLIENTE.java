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
public class CLIENTE {
    
    public String cod_cli; 
    public String p_apellido;
    public String num_cuenta;
    public String direccion; 
    public String tlf;   
	public List<PERSONA> persona=new PERSONA();
	public MASCOTA [] mascota = new MASCOTA();
    

	public void add_mascota(MASCOTA mascota) {
        this.MASCOTA=mascota;
    }
	
	public void add_persona(PERSONA persona) {
        this.PERSONA=persona;
    }
    
    
}
