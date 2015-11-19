/**Realiza un programa que vaya pidiendo números hasta que se introduzca un numero
negativo y nos diga cuantos números se han introducido, la media de los impares y el mayor
de los pares. El número negativo sólo se utiliza para indicar el final de la introducción de
datos pero no se incluye en el cómputo.**/


import java.util.Scanner;

public class C05ejercicio21 {
	
	public static void main(String[] args) {
		
			double num = 1;
			double nummayor = 0;
			double media = 0;
			int cont = 0;
			while(num >= 0){
						Scanner s = new Scanner(System.in);
						System.out.print("Introduce numero : ");
							
						 num = Double.parseDouble(s.nextLine());
					if(num % 2 !=0){
						
						if(num >= 0){
						media = num + media;
						cont++;	
						
						}	
						
					}
					
					if(num % 2 == 0){
						
						if(num > nummayor){
						
						nummayor= num;	
						
						}	
							
								
					}
					
					
							
					}			
			System.out.print("la media impares es: " + (media / cont ) + "\n");
			System.out.print("el numero mayor par es: " + nummayor + " ");
	}
}
