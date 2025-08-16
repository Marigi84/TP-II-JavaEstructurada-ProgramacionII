/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package añobisiesto;

import java.util.Scanner;

public class AñoBisiesto {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        
        //Pedir al usuario que ingrese un año
        System.out.print("Introduce un año: ");
        int anio = Integer.parseInt(input.nextLine());
        
        //determinar si es bisiesto llamando a la función esbisiesto
        if (esbisiesto(anio)){
            System.out.println(anio + " es bisiesto");
        }
        else
            System.out.println(anio + " no es bisisesto.");
       
    }
    //función para determinar si un año es bisiesto
    public static boolean esbisiesto(int anio){
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }
    
}
