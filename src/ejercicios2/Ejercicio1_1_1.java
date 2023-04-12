/***************************************
 * Autor: Leticia Hernández Reyes      *
 * Fecha de creación: 08/04/2023       *
 * Fecha de modificación: 08/04/2023   *
 * Descripción: Pide un numero y       *
 * muestra los numeros impares que hay *
 * entre el 1 y el número digitado     *                       
 ***************************************/

package ejercicios2;

import java.util.Scanner;

public class Ejercicio1_1_1 {

	public static void main(String[] args) {
		 Scanner imp = new Scanner(System.in);
		 int num;
	     System.out.println("Ingrese un número entero positivo: ");
	     num = imp.nextInt();
	     System.out.println("");

	     System.out.println("Los números impares desde 1 hasta " + num + " son: ");
	     
	        for (int i = 1; i <= num; i++) {
	            if (i % 2 != 0) {
	                System.out.print(i + " ");
	            }
	        }

	}

}
