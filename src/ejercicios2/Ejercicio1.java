/***************************************
 * Autor: Leticia Hernández Reyes      *

 * Fecha de Creación: 03/04/2023       *
 * Fecha de Actualización: 03/04/2023  *
 * Descripción: Calcula el salario     *
 * de una persona        			   *
 ***************************************/


package ejercicios2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sal = new Scanner(System.in);
		int hora, coste, salario;
		System.out.println("Ingrese las horas trabajadas: ");
		hora = sal.nextInt();
		System.out.println("Ingrese el costo por hora: ");
		coste = sal.nextInt();
		
		salario = hora * coste;
		
		System.out.println("La paga total es de: " + salario);

	}

}
