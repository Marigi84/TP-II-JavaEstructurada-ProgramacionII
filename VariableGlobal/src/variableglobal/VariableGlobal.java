/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package variableglobal;

import java.util.Scanner;

public class VariableGlobal {
    
    // Variable global para el porcentaje de descuento (10%)
    public static final double DESCUENTO_ESPECIAL = 0.10;
    
     // Método main para probar la funcionalidad
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Solicitar al usuario que ingrese el precio
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = input.nextDouble();

        // Llamar al método para calcular el descuento
        double descuentoAplicado = calcularDescuento(precioProducto);
        
        // Calcular el precio final
        double precioFinal = precioProducto - descuentoAplicado;

        // Mostrar los resultados
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);

        input.close();
    }
    
public static double calcularDescuento(double precio) {
        // La variable 'descuento' es local a este método
        double descuento = precio * DESCUENTO_ESPECIAL;
        return descuento;
}
    
}
