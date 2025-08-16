/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoradescuento;

import java.util.Scanner;

public class CalculadoraDescuento {
    public static void main(String[] args) {
       //creamos objeto scanner para leer la entrada del usuario
       Scanner input = new Scanner(System.in);
       
       //declaramos variables
       double precio, descuento = 0, precioFinal;
       char categoria;       
       
       //pedimos al usuario los datos y los guardamos en variables
       System.out.print("Ingrese el precio de producto:");
       precio = input.nextInt();
       
       System.out.print("Ingrese la categoría del producto (A, B o C): ");
       categoria = input.next().toUpperCase().charAt(0);
       
       //Aplicamos descuento seguon cada caso con un swich
       switch(categoria){
           case 'A':
               descuento = precio * 0.10;
               break;
           case 'B':
               descuento = precio * 0.15;
               break;
           case 'C':
               descuento = precio * 0.20;
               break;
           default:
               System.out.print("Categoría no válida para descuento.");
       }
               
        precioFinal = precio - descuento;
               
        //mostrar por consola 
        System.out.println("Precio Original: $ " + precio );
        System.out.println("Decuento: $ " + descuento);
        System.out.println("El total a abonar es: $ " + precioFinal);        
        
        input.close();
       
       
        
     
        
    }
    
}
