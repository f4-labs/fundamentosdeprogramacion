package basicos.entrada;

import java.util.Scanner;

/**
 * Solicita 2 números por el teclado e imprime la suma de ellos. La instancia del
 * "Scanner" permite obtener desde el teclado lo siguiente: cadenas de texto, numero
 * enteros, numeros con punto decimal, etc.
 * 
 * En este ejemplo se obtiene desde el teclado 2 números, por lo que el metodo a ejecutar
 * de Scanner será .nextInt()
 * 
 * .nextInt() obtendra un número desde el teclado.
 * 
 * @author Jorge
 *
 */

public class SumarDosNumeros { /* clase publica principal */

	public static void main (String[] args) { /* metodo principal */
		
		/* declaración de variables */
		int numero1 = 0;
		int numero2 = 0;
		int resultadoDeSuma = 0;
		
		Scanner input = new Scanner(System.in); /* instancia de la libreria Scanner */
		
		System.out.println("Ingrese el primer número"); /* imprime en consola */
		numero1 = input.nextInt(); /* solicita el primer número */
		
		System.out.println("Ingrese el segundo número"); /* imprime en consola */
		numero2 = input.nextInt(); /* solicita el segundo número */
		
		resultadoDeSuma = numero1 + numero2; /* realiza la operacion de suma*/
		
		/* imprime el resultado */
		System.out.println("La suma de los 2 números es: " + resultadoDeSuma);
		
		input.close(); /* cerramos la instancia */
	}
	
}
