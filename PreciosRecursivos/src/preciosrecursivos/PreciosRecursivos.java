/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package preciosrecursivos;
public class PreciosRecursivos {
    public static void main(String[] args) {
        //Declarar e inicializar un array con precios
        double[] precios = {199.99, 299.50, 149.75, 399.00, 89.99};

        // Usar la funci�n recursiva para mostrar los precios originales
        System.out.println("Precios originales:");
        imprimirPrecios(precios, 0);

        //Modificar el precio de un producto espec�fico (ejemplo: el tercer producto)
        int indiceAModificar = 2; // El tercer elemento tiene el �ndice 2
        double nuevoPrecio = 129.99;
        precios[indiceAModificar] = nuevoPrecio;

        //Usar la funci�n recursiva para mostrar los valores modificados
        System.out.println("\nPrecios modificados:");
        imprimirPrecios(precios, 0);
    }
    // Funci�n recursiva para imprimir el array
    public static void imprimirPrecios(double[] precios, int indice) {
        // Caso base: si el �ndice es igual o mayor a la longitud del array, la recursi�n termina
        if (indice >= precios.length) {
            return;
        }
        //Caso recursivo: imprime el precio en el �ndice actual y llama a la funci�n con el siguiente �ndice
        System.out.println("Precio: $" + precios[indice]);
        imprimirPrecios(precios, indice + 1);
    }  
}
