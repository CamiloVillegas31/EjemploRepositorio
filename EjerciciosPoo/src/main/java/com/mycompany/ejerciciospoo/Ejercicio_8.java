
package com.mycompany.ejerciciospoo;

import java.util.Scanner;

public class Ejercicio_8 {


    public static void main(String[] args) {
        boolean exit = true;
        int a = 0;
        int b = 0;
        //int opcion = 0;
        
        //System.out.println("Ingrese un numero:");
        //Scanner teclado = new Scanner(System.in);
        //int tabla = teclado.nextInt();
        while (exit == true) { 
            System.out.println("1: Suma");
            System.out.println("2: Resta");
            System.out.println("3: Multiplicación");
            System.out.println("4: Dividir");
            System.out.println("0: Salir");
            System.out.println("_________________________");
            System.out.println("Ingrese una opción: ");
            Scanner teclado = new Scanner(System.in);
            int opcion = teclado.nextInt();
            if ((opcion == 1) || (opcion == 2) || (opcion == 3)||(opcion == 4)||(opcion==0)) {
                if (opcion ==1) {
                    System.out.println("Proceso de suma");
                    //Scanner a = new Scanner(System.in);

                    
                }
                if (opcion == 2) {
                    System.out.println("Proceso de resta");
                    
                }
                if (opcion == 3) {
                    System.out.println("Proceso de multiplicación");
                    
                }
                if (opcion == 4) {
                    System.out.println("Proceso de division");
                    
                }
                if (opcion == 0) {
                    exit=false;
                    System.out.println("Fin del programa");
                }
                
            }else{
                System.out.println("Ingrese un número valido");
            }
        }           
            
        }
        
  

       
    
}
