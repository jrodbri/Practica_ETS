
package com.mycompany.practica;


public class Operaciones {
    
    public Operaciones () {};
    
    public void operacion1 (double num1, double num2) {
        double resultado = num1;
        
        for (int cont = 1; cont < num2; cont++)
            resultado = resultado * num1;
        System.out.println("El resultado de " + num1 + " elevado a " + num2 + " es: " + resultado);
    }    
}
