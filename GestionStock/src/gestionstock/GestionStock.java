/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionstock;

import java.util.Scanner;

public class GestionStock {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Solicitar al usuario los datos
        System.out.print("Ingrese el stock actual del producto: ");
        int stockActual = input.nextInt();

        System.out.print("Ingrese la cantidad vendida: ");
        int cantidadVendida = input.nextInt();

        System.out.print("Ingrese la cantidad recibida: ");
        int cantidadRecibida = input.nextInt();

        // Calcular el nuevo stock utilizando el método
        int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);

        // Mostrar el resultado
        System.out.println("El nuevo stock del producto es: " + nuevoStock);

        input.close();
     
    }
    //metodo para calcular el nuevo stock
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
    }
    
}
