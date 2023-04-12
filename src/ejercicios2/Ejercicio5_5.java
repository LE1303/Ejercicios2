/***************************************
 * Autor: Leticia Hernández Reyes      *
 * Fecha de creación: 06/04/2023       *
 * Fecha de modificación:07/04/2023    *
 * Decripcion: Calcula el IMC de una   *
 * persona y lo clasifica              *
 ***************************************/

package ejercicios2;

import java.util.Scanner;

public class Ejercicio5_5 {

	public static void main(String[] args) {
		Scanner id = new Scanner (System.in);
		
		double libras, altura, kg, M, IMC;
		String categoria;
		
		System.out.println("Introduzca su peso en libras: ");
		libras = id.nextDouble();
		System.out.println("Introduzca su altura en cm: ");
		altura = id.nextDouble();
		System.out.println("");
		
		kg = libras*0.453592;
		M = altura/100;
		
		IMC = kg/(M*M);
		
		if(IMC < 18.5) {
			categoria = "bajo peso :/";
		}else if(IMC <25) {
			categoria = "peso normal.. :)";
		}else if(IMC <30) {
			categoria = "sobrepeso.. :o";
		}else {
			categoria = "obesidad.. :[";
		}
		
		System.out.println("Su peso es: "+kg);
		System.out.println("Su IMC es de: "+IMC);
		System.out.println("Usted esta en la categoría: "+categoria);

	}

}
