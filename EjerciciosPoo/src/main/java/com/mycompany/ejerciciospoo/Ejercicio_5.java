
package com.mycompany.ejerciciospoo;

public class Ejercicio_5 {

    public static void main(String[] args) {
    
        int num = 10;
        int pares = 0;
        int sumaPares = 0;
       
        for (int i = 1; i <= num; i++) {
            double residuo = i % 2;
            if (residuo == 0) {
                System.out.println("El número "+i+" es par");
                pares++;
                sumaPares = sumaPares + i;
            }

            if (i==num) {
                System.out.println("En total hay "+pares+" numeros pares");
                System.out.println("La sumatoria de esos "+pares+" numeros pares es "+sumaPares);
            }
        }
    }
    
}
