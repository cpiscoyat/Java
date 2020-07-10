/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicjava;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class BasicJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      double numero1=85;
      double numero2=85;

      //Ejercicio 1
      /*  System.out.println("La suma es "+ (numero1 + numero2));
        System.out.println("La resta es "+ (numero1 - numero2));
        System.out.println("La multiplicación es "+ (numero1 * numero2));
        System.out.println("La división es "+ (numero1 / numero2));
        System.out.println("El resto es "+ (numero1 % numero2));*/
      
      //Ejercicio2
      /*if(numero1>numero2){
          System.out.println(numero1+" es mayor que "+ numero2);
          
      }else if(numero1==numero2){
          System.out.println(numero1+" es igual que "+numero2);
         
      }else{
          System.out.println(numero2 +" es mayor que "+numero1);
      }*/
      
      //Ejercicio 3
        /*
        String nombre="Fernando";
        System.out.println("Bienvenido "+nombre);
      */
      
      
      //Ejercicio 4
      
      /*Scanner sc =new Scanner(System.in);
      //Scanner sc2 =new Scanner(System.in);
      System.out.println("Ingresame un nombre: ");
      String nombre=sc.next();
      System.out.println("Bienvenido "+nombre);*/
      
      
      //Ejercicio 5
      /*Scanner sc =new Scanner(System.in);
      System.out.println("Ingrésame un radio:");
      String radio=sc.next();
      double area=0;
      double radioD= Double.parseDouble(radio);
      area=Math.PI*Math.pow(radioD,2);
        System.out.println("El área es "+area);*/
      
      //Ejercicio 6
      /*Scanner entrada= new Scanner(System.in);
      System.out.println("Ingrésame un número");
      int numero = entrada.nextInt();
      
      if (numero%2==0){
          System.out.println("Es divisible entre 2");
      }else{
          System.out.println("No es divisible entre 2");
      } */
      
      //Ejercicio 7
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Ingrésame un ascii: ");
        int codigo=sc.nextInt();
        char caracter = (char) codigo; //casteo
        System.out.println("El código ascii "+ codigo + " corresponde con el caracter "+caracter);*/
      
      //Ejercicio 8
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Ingrésame un caracter: ");
        char x=sc.next().charAt(0); //Lee el primer caracter "Aguila"
        int codigo= (int) x; //(int) "A"
        System.out.println("El codigo de "+x+" es "+ codigo);*/
       
      //Ejercicio 9
      
       /*final float IGV = 0.18f;
       Scanner sc = new Scanner(System.in);
       System.out.println("Ingresame un precio");
       double precio=sc.nextDouble();
        System.out.println("El valor final es "+   (precio*(1+IGV)));*/
   
        //Ejercicio 10
       /* int i=1;
        while(i<=100){
            System.out.println("Numero "+ i);
            i++;  
            //i+=2;
        }*/
        
      //Ejercicio 11
        /*for(int x=1;x<=100;x++){
            System.out.println("Numero "+ x);
        }*/

    
    }
}
