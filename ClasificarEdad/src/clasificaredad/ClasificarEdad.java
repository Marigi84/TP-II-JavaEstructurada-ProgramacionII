/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasificaredad;

import java.util.Scanner;

public class ClasificarEdad {
    public static void main(String[] args) {
        //Creamos un objeto scanner para leer la entrada del usuario
        Scanner input = new Scanner(System.in);
        
        //solicitamos al usuari su edad
        System.out.print("Por favor ingrese su edad: ");
        int edad = input.nextInt();
        
        //inicializamos variable para la etapa de la vida
        String etapaVida;
        
        if (edad < 12){
            etapaVida = "Niño.";
        }else if (edad >= 12 && edad <= 17){
            etapaVida = "Adolecente.";
        }else if (edad >=18 && edad <= 59){
            etapaVida = "Adulto.";
        }else
            etapaVida = "Adulto Mayor.";
        
        //mostramos por consola
        System.out.println("Usted se encuentra en la etapa de la vida: " + etapaVida);
        
        input.close();
            
    }
    
}
