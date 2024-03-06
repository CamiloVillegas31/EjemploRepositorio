
package com.mycompany.ejerciciospoo;

import java.util.Scanner;

public class Ejercicio_6 {
//ciclo While
    public static void main(String[] args) {
        
        System.out.println("Ingrese un numero:");
        Scanner teclado = new Scanner(System.in);
        int tabla = teclado.nextInt();
        int cont = 0;
        
        while (cont <= 10) { 
            int resultado = tabla * cont;
            System.out.println(tabla+"X"+cont+"="+resultado);
            cont++;
        }
    }
    
}
