/**Escribe un programa que obtenga los números enteros comprendidos entre dos números
introducidos por teclado y validados como distintos, el programa debe empezar por el
menor de los enteros introducidos e ir incrementando de 7 en 7.*/

import java.util.Scanner;

public class C05ejercicio18 {
	
	public static void main(String[] args) {
		
		
						int num = 0;
						int num2 =0;
		
						
						int resultado =0;
						int suma=0;

						Scanner s = new Scanner(System.in);
						System.out.print("Introduce numero : ");
							
						num = Integer.parseInt(s.nextLine());
						
						
						
						System.out.print("Introduce numero : ");
							
						num2 = Integer.parseInt(s.nextLine());
						
						
						
						
						for(int cont=num ; cont <= num2; cont = cont + 7){
							
								System.out.print(" " + cont + " ");
							   
							
							
						}
						
						
						
			
	}
}
