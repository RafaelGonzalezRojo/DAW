/**
*Rafael Gonzalez Sarcasticboy
*Escribe un programa que pinte por pantalla una pirámide rellena a base de asteriscos. La
*base de la pirámide debe estar formada por 9 asteriscos.
*/

public class C01Ejercicio06 {
	public static void main(String[] args) {
		//colores variados		
		String morado = "\033[35m";
		String blanco = "\033[37m";
		String verde = "\033[32m";
		String naranja = "\033[33m";
		String azul = "\033[34m";
		String rojo = "\033[31m";
		
		System.out.print(rojo + "    *\n");
		System.out.print(azul + "   ***\n");
		System.out.print(naranja + "  *****\n");			
		System.out.print(verde + " *******\n");
		System.out.print(morado + "*********\n" + blanco);

	}	
}
