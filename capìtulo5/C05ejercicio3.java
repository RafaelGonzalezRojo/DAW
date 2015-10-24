/**Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do while.*/

import java.util.Scanner;

public class C05ejercicio3 {
	
	public static void main(String[] args) {
		
	int multiplo = 0;	
	int cont = 0;
		
			System.out.print(" Multiplos de 5 , de 0 hasta 100 \n");

	do{
			
			
			multiplo = 5 * cont;
			
			System.out.print(" " + multiplo + " \n");
		
			cont++;
	}while(cont <= 100);			
			
	}
}
