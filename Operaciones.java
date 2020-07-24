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
class Operaciones{
    
   public  double x;
   public  double y;
    static public double z=3.1416;

    public Operaciones(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Operaciones(double x) {
        this.x = x;
    }

    public Operaciones() {
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void Operar(){
        System.out.println("Operaciones Básicas");  
    } 
    
    public double Sumar(){
        return x+y;
    }
    
    public double Restar(){
        return x-y;
    }
    
    public double Multiplicar(){
        return x*y;
    }
    
    public double Dividir(){
        return x/y;
    }

    @Override
    public String toString() {
        return ""+x;
    }
    

    
    
    
}