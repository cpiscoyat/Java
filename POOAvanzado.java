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
public class POOAvanzado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente c=new Cliente();
        Cliente c1 = new Cliente("Juan");
        Cliente c2=new Cliente(1);
        Cliente c3=new Cliente(2,"Pepito");
        
        ClientePremiun cp1=new ClientePremiun(3,"Luis",500.00);
        System.out.println("El id es: "+cp1.getId());
        System.out.println("El nombre es: "+cp1.getNombre());
        System.out.println("El bono es: "+cp1.getBono());
        
        ClienteNormal cn1= new ClienteNormal(4,"María","1245689",15);
        cn1.setEdad(16);
        cn1.setNombre("Marie");
        System.out.println("El id es: "+cn1.getId());
        System.out.println("El nombre es: "+cn1.getNombre());
        System.out.println("La tarjeta es: "+cn1.getTarjeta());
        System.out.println("La edad es: "+cn1.getEdad());
        
    }
    
}
