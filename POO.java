/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author Carlos
 */
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Operaciones op = new Operaciones(); // Instancia
       op.Operar();
       op.setX(5);
       op.setY(10);
       
       Operaciones op2=new Operaciones();
       op2.setX(50);
       op2.setY(20);
       
       Operaciones op3=new Operaciones(2,9);       
     
       double suma2= op.Sumar();
       System.out.println("La suma es "+suma2);
       System.out.println("La resta es "+op.Restar());
       System.out.println("la multiplicacion es "+op.Multiplicar());
       System.out.println("la división es "+op.Dividir());
       System.out.println("Multiplicando PI x X"+ (Operaciones.z*op.getX()));
        
       System.out.println("----------------------------------------------------------------");
       System.out.println("La suma "+op3.Sumar());
       System.out.println("La suma "+op3.Restar());
       System.out.println("La suma "+op3.Multiplicar());
       System.out.println("La suma "+op3.Dividir());
       
       System.out.println(op3);
    }
    
}

