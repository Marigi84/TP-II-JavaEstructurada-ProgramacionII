/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package validacionnota;

import java.util.Scanner;

public class ValidacionNota {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //declaramos variable nota
        int nota;
        
        do {
            System.out.print("Ingrese una nota (0-10): ");
            
            // Verifica si la entrada del usuario es un número entero
            while (!input.hasNextInt()) {
                // si la entrada no es un numero entero, aparecerá un mensaje de eeror y se 
                //pedirá otro número.
                System.out.println("Error: Entrada inválida. Por favor, ingrese un número.");
                System.out.print("Ingrese una nota (0-10): ");
                input.next(); // Descarta la entrada no válida
            }            
            nota = input.nextInt();

            if (nota < 0 || nota > 10) {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            }

        } while (nota < 0 || nota > 10);

        System.out.println("Nota guardada correctamente.");
        
        input.close();
       
    }
    
}
