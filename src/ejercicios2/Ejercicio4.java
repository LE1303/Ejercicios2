/***************************************
 * Autor: Leticia Hernández Reyes      *

 * Fecha de Creación: 03/04/2023       *
 * Fecha de Actualización: 03/04/2023  *
 * Descripción: Recibe dos numero      *
 *  enteros e imprime un mensaje       *
 ***************************************/

package ejercicios2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		int numero1,numero2;
		int operacion;
		
		System.out.println("Ingrese el primero numero: ");
		numero1 = num.nextInt();
		
		System.out.println("Ingrese el segundo numero: ");
		numero2 = num.nextInt();
		
		operacion = numero1 / numero2;
		int residuo = numero1 % numero2;
		 System.out.println(numero1 +" entre "+ numero2 + " da un cosiente de "+ operacion +" y un resto de "+ residuo +" donde \n"+numero1+" y "+numero2+" son los numeros introducidos por el ususario. y \n"+operacion+" y "+residuo+" son el cosiente y el resto de la division respectivamente" );
		 

	}

}
