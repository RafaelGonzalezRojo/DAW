/**Escribe un programa que lea 10 números por teclado y que luego los muestre en orden
inverso, es decir, el primero que se introduce es el último en mostrarse y viceversa.*/

import java.util.Scanner;

public class C07Ejercicio3{
public static void main(String[] args) {
int[] num; // se define num como un array de enteros
num = new int[10]; // se reserva espacio para 11 enteros

							//en vede 9 se puede poner x.length(siendo la x el array que sea) para que lo recorra automaticamente
		for(int cont2=0;cont2<num.length;cont2++){
				
				Scanner s = new Scanner(System.in);
						System.out.print("Introduce numero : ");
							
						num[cont2] = Integer.parseInt(s.nextLine());
			
		}	
			
		
		for (int cont=9;cont>=0;cont--) { 
				
				System.out.print(num[cont] + " ");
				
		}
		
	}
}
