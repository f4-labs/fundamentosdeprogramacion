package basicos.tiposdedatosprimitivos;

/**
 * 
 * @author Jorge
 *
 * La declaracion char se utiliza cuando las variables corresponden a un simbolo de la tabla
 * de caracteres Unicode.
 * 
 * Se pueden asignar el valor unicode en el siguiente formato:
 * 
 * char letraA = '\u0041';
 * 
 * La letra "A" mayuscula en el sistema ASCII es el numero 65 de Decimal y en HexaDecimal es 41.
 * 
 * NOTA: Para declarar un char a nulo, se realiza de la siguiente forma:
 * 
 * char caracter = '\u0000';
 *
 */

public class Caracter {

	public static void main(String[] args) {
		
		
		char letraAUnicode = '\u0041';
		
		System.out.println(letraAUnicode);
		
		char letraA = 'A';
		
		System.out.println(letraA);
		
	}
	
}
