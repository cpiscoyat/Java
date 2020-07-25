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
public class ClientePremiun extends Cliente{
    
    //propiedades que heredará del papá CLiente
    /*private int id;
    private String nombre;*/
    
    //Su propia propiedad
    private double bono;

    public ClientePremiun(int id, String nombre, double bono) {
        super(id, nombre); //Superior
        this.bono = bono;
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }
     
}
