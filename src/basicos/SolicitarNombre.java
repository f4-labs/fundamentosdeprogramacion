package basicos;

/* importaciones de librerias */
import java.util.Scanner;

/**
 * 
 * @author Jorge
 *
 * Solicita un nombre por el teclado e imprime "Hola <nombre>"
 */

public class SolicitarNombre { /* clase principal */

	public static void main (String[] args) { /* metodo principal */
		
		/**
		 * 
		 * Se declara una instancia de la libreria Scanner, Scanner nos ayuda
		 * a recoger datos desde el teclado.
		 * 
		 **/
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduzca su nombre"); /* mostramos un mensaje */
		String nombre = entrada.nextLine(); /* solicitamos que ingrese un nombre */
		
		/**
		 * 
		 * "Hola " = es una cadena de texto
		 * nombre = es una variable que contiene lo que ingresa el usuario
		 * 
		 * para imprimir "Hola Juan" por ejemplo es necesario concatenar, para lograr
		 * concatenar 2 cadenas de texto "Hola " y "Juan" es necesario utilizar
		 * el operador +
		 * 
		 */
		
		System.out.println("Hola " + nombre); /* imprime "Hola <nombre>"*/
		
		entrada.close(); /* cerramos la instancia de entrada */
		
	}
	
}
