/**Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de los 5 primeros
números enteros a partir de uno que se introduce por teclado.*/

import java.util.Scanner;

public class C05ejercicio11 {
	
	public static void main(String[] args) {
		
		
						Scanner s = new Scanner(System.in);
						System.out.print("Introduce nnumero : ");
							
					int num = Integer.parseInt(s.nextLine());
				
					for(int cont= 0;cont <=4; cont++){
						
					System.out.print("cuadrado: " + ((num + cont) * (num + cont)) + "\t " + " cubo: " + ((num + cont) * (num + cont) * (num + cont)) +" sus cinco primeros numero: " );
								
								for (int cont2=1; cont2 <=5; cont2++){
									
										System.out.print(" " + (num + cont2) + " ");
								
								}
								  
					System.out.print("\n");					
							
					}			
			
	}

}
