/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modificarprecios;
public class ModificarPrecios {
    public static void main(String[] args) {
       // declarar e inicializar un array con los precios de algunos productos.
        double[] precios = {199.99, 299.50, 149.75, 399.00, 89.99};

        //Muestra los valores originales de los precios
        System.out.println("Precios originales:");
        for (int i = 0; i < precios.length; i++) {
            System.out.println("Precio: $" + precios [i]);
        }
        // Vamos a modificar el tercer precio (índice 2)
        precios[2] = 129.99;

        //Muestra los valores modificados.
        System.out.println("\nPrecios modificados:");
        for (int i = 0; i <precios.length; i++) {
            System.out.println("Precio: $" + precios[i]);
        }
    }
    
}
