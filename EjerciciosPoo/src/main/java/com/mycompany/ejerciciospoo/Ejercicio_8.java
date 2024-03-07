
package com.mycompany.ejerciciospoo;

import java.util.Scanner;

public class Ejercicio_8 {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean exit = true;
        int opcion;
        Double a;
        Double b;
        Double c;
        //int opcion = 0;
        
        //System.out.println("Ingrese un numero:");
        //
        //int tabla = teclado.nextInt();
        while (exit == true) { 
            System.out.println("1: Suma");
            System.out.println("2: Resta");
            System.out.println("3: Multiplicación");
            System.out.println("4: Dividir");
            System.out.println("0: Salir");
            System.out.println("_________________________");
            System.out.println("Ingrese una opción: ");
            //Scanner teclado = new Scanner(System.in);
            opcion = teclado.nextInt();
            if ((opcion == 1) || (opcion == 2) || (opcion == 3)||(opcion == 4)||(opcion==0)) {
                if (opcion ==1) {
                    System.out.println("Proceso de suma");
                    System.out.println("____________________________");
                    System.out.println("Ingrese el primer número");
                    a = teclado.nextDouble();
                    System.out.println("Ingrese el segundo número");
                    b = teclado.nextDouble();
                    c = a+b;
                   System.out.println("La suma de "+a+" + "+b+" = "+c);
                }
                if (opcion == 2) {
                    System.out.println("Proceso de resta");
                    System.out.println("____________________________");
                    System.out.println("Ingrese el primer número");
                    a = teclado.nextDouble();
                    System.out.println("Ingrese el segundo número");
                    b = teclado.nextDouble();
                    c = a-b;
                   System.out.println("La resta de "+a+" - "+b+" = "+c);
                }
                if (opcion == 3) {
                    System.out.println("Proceso de multiplicación");
                    System.out.println("____________________________");
                    System.out.println("Ingrese el primer número");
                    a = teclado.nextDouble();
                    System.out.println("Ingrese el segundo número");
                    b = teclado.nextDouble();
                    c = a*b;
                   System.out.println("La multiplicación de "+a+" x "+b+" = "+c);
 
                    
                }
                if (opcion == 4) {
                    System.out.println("Proceso de division");
                    System.out.println("____________________________");
                    System.out.println("Ingrese el primer número");
                    a = teclado.nextDouble();
                    System.out.println("Ingrese el segundo número");
                    b = teclado.nextDouble();
                    c = a/b;
                   System.out.println("La división de "+a+" / "+b+" = "+c);
 
                    
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
