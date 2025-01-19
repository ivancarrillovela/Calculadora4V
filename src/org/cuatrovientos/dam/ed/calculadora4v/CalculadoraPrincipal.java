package org.cuatrovientos.dam.ed.calculadora4v;

import java.util.Scanner;

public class CalculadoraPrincipal {

	public static void main(String[] args) {

		// Variables principales
		Scanner scanner = new Scanner(System.in);
		double resultado = Double.NaN; // Inicializo a NaN y así se se he podido realizar la operación.
		
		// Presentación del programa
		imprimirPresentacion();
		
		// Pido los datos que necesito
		System.out.print("Introduce número 1: ");
		double numero1 = scanner.nextDouble();
		System.out.print("Introduce número 2: ");
		double num2 = scanner.nextDouble();
		
		// Pido la operacion
		imprimirMenu();
		int operacion = scanner.nextInt();
		switch (operacion) {
			case 1:
				resultado = sumar(numero1, num2);
				break;
			case 2:
				resultado = restar(numero1, num2);
				break;
			case 3:
				resultado = multiplicar(numero1, num2);
				break;
			case 4:
				resultado = dividir(numero1, num2);
				break;
			default:
				System.out.println("ERROR! Tienes que elegir una de las opciones disponibles...");
				break;
		}
		//TODO Crear caso para operar raices cuadradas
		
		
		// Resultado
		if (Double.isNaN(resultado)) // Nunca utilizar la comparacion == con Double.NaN, porque no cumple estándar
			// IEEE 754
			System.err.println("No he podido obtener un resultado valido");
		else
			System.out.println("Enhorabuena!!! Tu resultado es: " + resultado);
		

		scanner.close();
	}

	private static void imprimirPresentacion() {
		System.out.println("==========================");
		System.out.println("Calculadora 4V");
		System.out.println("Dime 2 operandos y una operación a realizar y yo te sacaré el resultado");
		System.out.println("==========================");
	}

	private static void imprimirMenu() {
		System.out.println("Operaciones disponibles: ");
		System.out.println("\t1.- Suma ");
		System.out.println("\t2.- Resta ");
		System.out.println("\t3.- Multiplicación ");
		System.out.println("\t4.- División ");
		System.out.print("Que operación quieres realizar: ");
	}

	/**
	 * Division de 2 numeros a no ser que se quiera dividir entre 0, entonces da
	 * error y devuelve NaN
	 * 
	 * @param num1
	 * @param num2
	 * @return El resultado o NaN si no se puede dividir
	 */
	private static double dividir(double operando1, double operando2) {

		// Si quiere dividir por 0 da mensaje de error y devuelve NaN
		if (operando2 == 0) {
			System.err.println("No podemos dividor por 0!!!!");
			return Double.NaN;
			//FIXME Solucionar bug
		}
		// Si no devuelve el resultado de la division
		return operando1 / operando2;
	}
	

	/**
	 * Multiplicación de 2 numeros de tipo double
	 * 
	 * @param num1
	 * @param num2
	 * @return El resultado de la multiplicacion
	 */
	private static double multiplicar(double operando1, double operando2) {
		return operando1 * operando2;
	}
	

	/**
	 * Resta de 2 numeros tipo double
	 * 
	 * @param num1
	 * @param num2
	 * @return El resultado de la resta
	 */
	private static double restar(double operando1, double operando2) {
		return operando1 - operando2;
	}

	/**
	 * Suma de 2 numeros tipo double
	 * 
	 * @param num1
	 * @param num2
	 * @return El resultado de la suma
	 */
	private static double sumar(double operando1, double operando2) {
		return operando1 + operando2;
	}

}
