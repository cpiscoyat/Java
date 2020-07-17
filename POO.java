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
        
       Operaciones op = new Operaciones();
       op.Operar();
       op.x=5;
       op.y=10;
        
        double a=5;
        double b=10;
        
        //double suma=a+b;
        //System.out.println("La suma es "+suma);
        double suma2= op.Sumar();
        System.out.println("La suma es "+suma2);
        
        //double resta=a-b;
        //System.out.println("la resta es "+resta);
        System.out.println("La resta es "+op.Restar());
        
        double multiplicacion=a*b;
        System.out.println("la multiplicacion es "+multiplicacion);
        
        double division=a/b;
        System.out.println("la división es "+division);
    }
    
}

