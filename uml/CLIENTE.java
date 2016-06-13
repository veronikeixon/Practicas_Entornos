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
public class CLIENTE_FAMILIA {
    
    String cod_cli; 
    String p_apellido;
    String num_cuenta;
    String direccion; 
    String tlf;   
	List<PERSONA> persona=new PERSONA();
	MASCOTA [] mascota = new MASCOTA();
    

	public void add_mascota(MASCOTA mascota) {
        this.MASCOTA=mascota;
    }
	
	public void add_persona(PERSONA persona) {
        this.PERSONA=persona;
    }
	
    public CLIENTE_FAMILIA(String cod_cli, String p_apellido, String num_cuenta, String direccion, String tlf) {
        this.cod_cli = cod_cli;
        this.p_apellido = p_apellido;
        this.num_cuenta = num_cuenta;
        this.direccion = direccion;
        this.tlf = tlf;
    }
    public void addCLIENTE(String cod_cli, String p_apellido, String num_cuenta, String direccion, String tlf) {
        this.cod_cli = cod_cli;
        this.p_apellido = p_apellido;
        this.num_cuenta = num_cuenta;
        this.direccion = direccion;
        this.tlf = tlf;
    }
    public void delCLIENTE(String cod_cli, String p_apellido, String num_cuenta, String direccion, String tlf) {

    }
    
    public String getCod_cli() {
        return cod_cli;
    }

    public String getP_apellido() {
        return p_apellido;
    }

    public String getNum_cuenta() {
        return num_cuenta;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTlf() {
        return tlf;
    }

    public void setCod_cli(String cod_cli) {
        this.cod_cli = cod_cli;
    }

    public void setP_apellido(String p_apellido) {
        this.p_apellido = p_apellido;
    }

    public void setNum_cuenta(String num_cuenta) {
        this.num_cuenta = num_cuenta;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }

}
