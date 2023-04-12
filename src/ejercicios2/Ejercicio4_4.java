/***************************************
 * Autor: Leticia Hernández Reyes      *
 * Fecha de creación: 06/04/2023       *
 * Fecha de modificación: 06/04/2023   *
 * Descripción: Calcula el IMC y lo    *
 * clasifica según el resultado.       *  
 ***************************************/

package ejercicios2;

import java.util.Scanner;

public class Ejercicio4_4 {

	public static void main(String[] args) {
		Scanner imc = new Scanner(System.in);
		float estatura,IMC,peso;
		
		System.out.println("Ingrese su peso: ");
		peso = imc.nextInt();
		System.out.println("Ingrese su altura: ");
		estatura = imc.nextFloat();
		System.out.println("");
		
		IMC = peso/(estatura*estatura);
		
		if(IMC < 16) {
			System.out.println("Criterio de ingreso..");
		}else if(IMC >=16 && IMC <=16.9) {
			System.out.println("Usted tiene infrapeso...");
		}else if(IMC >=17 && IMC <=18.4) {
			System.out.println("Usted tiene peso bajo...");
		}else if(IMC >=18.5 && IMC <=24.9) {
			System.out.println("Esta entre el rango del peso normal");
		}else if(IMC >=25 && IMC <= 29.9) {
			System.out.println("Usted tiene sobrepeso...");
		}else if(IMC >=30 && IMC <= 34.9) {
			System.out.println("Usted tiene obesidad premórbida....");
		}else if(IMC >=40  && IMC <=45) {
			System.out.println("Usted tiene obesidad mórbida....");
		}else if(IMC >=45) {
			System.out.println("Usted tiene obesidad hipermórbida... :(");
		}
		

	}

}
