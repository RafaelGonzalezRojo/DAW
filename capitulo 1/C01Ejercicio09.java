/**
*Rafael Gonzalez Sarcasticboy
*Escribe un programa que pinte por pantalla alguna escena - el campo, la habitación de una
*casa, un aula, etc. - o algún objeto animado o inanimado - un coche, un gato, una taza
*de café, etc. Ten en cuenta que puedes utilizar caracteres como *, +, <, #, @, etc. ¡Échale
*imaginación!
*
*/

public class C01Ejercicio09{
	public static void main(String[] args) {
		//colores variados		
		String morado = "\033[35m";
		String blanco = "\033[37m";
		String verde = "\033[32m";
		String naranja = "\033[33m";
		String azul = "\033[34m";
		String rojo = "\033[31m";
		System.out.print(morado + "    *****\n" );
		System.out.print(morado + "    *****\n" );
		System.out.print(morado + "    *****\n" );
		System.out.print(morado + "    *****\n" );
		System.out.print(morado + "**************\n" );
		System.out.print(azul + "  * ```   *\n");
		System.out.print(naranja + "  * ^  ^  *\n");	
		System.out.print(azul + "  *   +   *\n");
	System.out.print(azul + "  *  ---  *\n");
		System.out.print(rojo + "  *********\n");
System.out.print(rojo + "  ************\n");
System.out.print(rojo + "  ****************\n" + blanco);
	
				
		
		

	}	
}
