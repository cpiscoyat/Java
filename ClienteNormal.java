/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooavanzado;

/**
 *
 * @author Carlos
 */
public class ClienteNormal extends Cliente {
    public String tarjeta;
    public int edad;

    public ClienteNormal(int id, String nombre, String tarjeta, int edad) {
        super(id, nombre);
        this.tarjeta = tarjeta;
        this.edad = edad;
    }

    public String getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
    
    
    
}
