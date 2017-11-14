package basicos.entrada;

import java.util.Scanner;

/**
 * Solicita 2 n�meros por el teclado e imprime la suma de ellos. La instancia del
 * "Scanner" permite obtener desde el teclado lo siguiente: cadenas de texto, numero
 * enteros, numeros con punto decimal, etc.
 * 
 * En este ejemplo se obtiene desde el teclado 2 n�meros, por lo que el metodo a ejecutar
 * de Scanner ser� .nextInt()
 * 
 * .nextInt() obtendra un n�mero desde el teclado.
 * 
 * @author Jorge
 *
 */

public class SumarDosNumeros { /* clase publica principal */

	public static void main (String[] args) { /* metodo principal */
		
		/* declaraci�n de variables */
		int numero1 = 0;
		int numero2 = 0;
		int resultadoDeSuma = 0;
		
		Scanner input = new Scanner(System.in); /* instancia de la libreria Scanner */
		
		System.out.println("Ingrese el primer n�mero"); /* imprime en consola */
		numero1 = input.nextInt(); /* solicita el primer n�mero */
		
		System.out.println("Ingrese el segundo n�mero"); /* imprime en consola */
		numero2 = input.nextInt(); /* solicita el segundo n�mero */
		
		resultadoDeSuma = numero1 + numero2; /* realiza la operacion de suma*/
		
		/* imprime el resultado */
		System.out.println("La suma de los 2 n�meros es: " + resultadoDeSuma);
		
		input.close(); /* cerramos la instancia */
	}
	
}
