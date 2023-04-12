/***************************************
 * Autor: Leticia Hernández Reyes      *
 * Fecha de creación: 04/04/2023       *
 * Fecha de modifcacion: 04/04/2023    *
 * Descripción: Calcula la velocidad de*
 * un objeto                           *
 ***************************************/



package ejercicios2;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		Scanner dis = new Scanner(System.in);
		int distancia;
		float tiempo, velocidad;
		
		System.out.println("Ingrese la distancia recorrida por el objeto: ");
		distancia = dis.nextInt();
		System.out.println("Ingrese el tiempo que tomó el objeto para recorrer esa distancia: ");
		tiempo = dis.nextFloat();
		
		velocidad = distancia / tiempo;
		
		System.out.println("La velocidad del objeto es: " + velocidad);
		
		
	}

}
