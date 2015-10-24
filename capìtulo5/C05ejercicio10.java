/**Escribe un programa que calcule la media de un conjunto de números positivos introduci-
dos por teclado. A priori, el programa no sabe cuántos números se introducirán. El usuario
indicará que ha terminado de introducir los datos cuando meta un número negativo.*/


import java.util.Scanner;

public class C05ejercicio10 {
	
	public static void main(String[] args) {
		
			double num = 1;
			double nota = 0;
			int cont = 0;
			while(num >= 0){
						Scanner s = new Scanner(System.in);
						System.out.print("Introduce nota : ");
							
						 num = Double.parseDouble(s.nextLine());
				
						if(num >= 0){
						nota = num + nota;
						cont++;	
						
						}	
							
							
					}			
			System.out.print("la media tiene: " + (nota / cont ) + " ");
	}
}
