/**Escribe un programa que permita ir introduciendo una serie indeterminada de números
mientras su suma no supere el valor 10000. Cuando esto último ocurra, se debe mostrar el
total acumulado, el contador de los números introducidos y la media.**/

import java.util.Scanner;

public class C05ejercicio23 {
	
	public static void main(String[] args) {
		
			int num = 0;
			int suma = 0;
			int cont = 0;
			while(suma < 10000){
						Scanner s = new Scanner(System.in);
						System.out.print("Introduce numero : ");
							
						 num = Integer.parseInt(s.nextLine());
				
						if(suma<= 10000){
						suma = num + suma;
						cont++;	
						
						}	
							
							
					}	
					if (suma > 10000){
						suma = suma - num;
						cont--;
					}	
					
							
			System.out.print("la media tiene: " + (suma / cont ) + "\n");
			System.out.print("la suma total: " + suma + "\n ");
			System.out.print("la numeros introducidos: " + (cont + 1) + "\n");
			
	}
}

