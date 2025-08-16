/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoraprecio;

import java.util.Scanner;

public class CalculadoraPrecio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Solicitar el precio base
        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = input.nextDouble();

        // Solicitar el impuesto en porcentaje
        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        double impuesto = input.nextDouble();

        // Solicitar el descuento en porcentaje
        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        double descuento = input.nextDouble();

        // Llamamos al método para calcular el precio final
        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);

        // Mostramos el resultado
        System.out.println("El precio final del producto es: " + precioFinal);

        input.close();
    }
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        // La fórmula es: PrecioFinal = PrecioBase + (PrecioBase * Impuesto) - (PrecioBase * Descuento)
        // Convertimos los porcentajes a su valor decimal
        double impuestoDecimal = impuesto / 100.0;
        double descuentoDecimal = descuento / 100.0;
        
        // Calculamos el impuesto y el descuento
        double montoImpuesto = precioBase * impuestoDecimal;
        double montoDescuento = precioBase * descuentoDecimal;
        
        // Aplicamos la fórmula para obtener el precio final
        return precioBase + montoImpuesto - montoDescuento;
    }    
}
