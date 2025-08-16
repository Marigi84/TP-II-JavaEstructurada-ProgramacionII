/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contadornumeros;

import java.util.Scanner;

public class ContadorNumeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       // declaramos e nicializamos los contadores
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;

        // Usamos un bucle for para pedir 10 n�meros
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el n�mero " + (i + 1) + ": ");
            int numero = input.nextInt();

            // Verificamos si el n�mero es positivo, negativo o cero
            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }
        input.close();

        // Imprimimos los resultados
        System.out.println("\nResultados:");
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
    }
    
}
