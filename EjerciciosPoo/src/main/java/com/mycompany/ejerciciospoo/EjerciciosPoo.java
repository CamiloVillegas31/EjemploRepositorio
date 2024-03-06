
package com.mycompany.ejerciciospoo;
import java.util.Scanner;

public class EjerciciosPoo {

    
    public static void main(String[] args) {
        System.out.println("Ingrese nombre: ");
        
        Scanner teclado = new Scanner(System.in);
        String nombre = teclado.nextLine();
        System.out.println("Su nombre es: "+nombre);
    } 
}
