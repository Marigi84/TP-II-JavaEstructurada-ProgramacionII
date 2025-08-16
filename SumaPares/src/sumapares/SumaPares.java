/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumapares;

import java.util.Scanner;

public class SumaPares {
    public static void main(String[] args) {
         // Inicializamos un objeto Scanner para leer la entrada del usuario
        Scanner input = new Scanner(System.in);
        //Definimos e inicializamos variables
        int sumaPares = 0, numero;    
        
        // pedimos el primer número antes de entrar al bucle
        System.out.print("Ingrese un número (0 para terminar): ");
        numero = input.nextInt();

        // Bucle while para procesar los números
        while (numero != 0) {
            // Verificar si el número es par
            if (numero % 2 == 0) {
                // Si es par, lo sumamos a la variable sumaPares
                sumaPares += numero;
            }
            // Solicita el siguiente número dentro del bucle
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = input.nextInt();
        }

        // Muestra la suma total de los números pares
        System.out.println("La suma de los números pares es: " + sumaPares);

        input.close();
    }
    
}
