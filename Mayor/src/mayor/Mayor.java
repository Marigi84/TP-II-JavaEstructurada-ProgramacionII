/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mayor;

import java.util.ArrayList;// Necesario para usar la clase ArrayList
import java.util.Scanner;// Necesario para leer la entrada del usuario desde la consola

public class Mayor {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        ArrayList<Integer> numeros = new ArrayList<>();// Se crea una lista vac�a para almacenar los n�meros.
        
        System.out.print("Ingrese 3 n�mero enteros: ");
        // Bucle para pedir y guardar tres n�meros del usuario
        
        for(int i = 0; i < 3; i++){
            System.out.print("Introduce el n�mero " + (i + 1) + ":");
            numeros.add(input.nextInt());// Se lee el n�mero y se a�ade al final de la lista
        }  //se llama a la funci�n encontrarMayor para lugo imprimir por pantalla en n�mero mayor 
        
        System.out.println("El n�mero mayor de la lista es: " + encontrarMayor(numeros));
        
        input.close();
        
    }
    // se crea funci�n encuentra el n�mero m�s grande en una lista de n�meros enteros.
    public static int encontrarMayor(ArrayList<Integer>numeros){ //recibe por parametro una lista de n�meros
        
        if(numeros == null || numeros.isEmpty()){
            System.out.println("La lista no puede estar vac�a, ingresa una que contenga numeros enteros:");
        }//se inicializa una variable mayor con el primer elemento de la lista
        int mayor = numeros.get(0);
        
        //ciclo for para comparar cada elemento de la lista y guardarlo en la variabe mayor
        for (int i = 1; i < numeros.size(); i++){
            if (numeros.get(i) > mayor){
                mayor = numeros.get(i);
            }
        }return mayor;
    }
}
