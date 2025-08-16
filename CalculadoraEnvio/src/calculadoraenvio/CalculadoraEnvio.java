/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoraenvio;

import java.util.Scanner;

public class CalculadoraEnvio {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        // Solicita los datos al usuario
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = input.nextDouble();

        System.out.print("Ingrese el peso del paquete en kg: ");
        double pesoPaquete = input.nextDouble();
        input.nextLine(); // Consumir el enter de l�nea

        //bandera para salir del ciclo while
        String zonaEnvio;
        boolean zonaValida = false;

        // Bucle para asegurar que el usuario ingrese una zona v�lida
        do {
            System.out.print("Ingrese la zona de env�o (Nacional/Internacional): ");
            zonaEnvio = input.nextLine();
            if (zonaEnvio.equalsIgnoreCase("Nacional") || zonaEnvio.equalsIgnoreCase("Internacional")) {
                zonaValida = true;
            } else {
                System.out.println("Zona de env�o no v�lida. Por favor, intente de nuevo.");
            }
        } while (!zonaValida);

        // Calcula el costo de env�o y el total de la compra
        double costoEnvio = calcularCostoEnvio(pesoPaquete, zonaEnvio);
        double totalPagar = calcularTotalCompra(precioProducto, costoEnvio);

        // Muestra los resultados
        System.out.println("El costo de env�o es: " + costoEnvio);
        System.out.println("El total a pagar es: " + totalPagar);

        input.close();
    }
    //m�todo calculador precio de envio, recibe el pezo y la zona
    public static double calcularCostoEnvio(double peso, String zona) {
        //equalsIgnoreCase, para no distinguir entre mayusculas y minusculas
        if (zona.equalsIgnoreCase("Nacional")) {
            return peso * 5;
        } else {
            return peso * 10;
        }
    }
    // m�todo para calcular el total con el envio, recibe el precio del producto y el costo del envio
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }
}
