/***************************************
 * Autor: Leticia Hernández Reyes      *
 * Fecha de creación: 04/04/2023       *
 * Fecha de modificación: 04/04/2023   *
 * Descripción: Calcula el peso total  *
 * de payasos y mulecas vendidas       *
 ***************************************/

package ejercicios2;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner peso = new Scanner(System.in);
		//igualamos payaso y muñeca a sus pesos en kilogramos, solo dividimos entre 1000 los gramos
		double Peso_payaso = 0.112;
		double Peso_muñeca = 0.075;
		int payaso;
		int muñeca;
		
		System.out.println("Ingrese la cantidad de payasos vendidos: ");
		payaso = peso.nextInt();
		System.out.println("Ingrese la cantidad de muñecas vendidas: ");
		muñeca = peso.nextInt();
		
		double pesoT = payaso * Peso_payaso + muñeca * Peso_muñeca;
		
		System.out.println("El peso total es de "+ pesoT+"Kg");
		
		
		

	}
	

}
