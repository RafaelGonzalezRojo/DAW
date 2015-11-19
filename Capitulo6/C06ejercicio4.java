/**Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados por
espacios.**/


import java.util.Scanner;

public class C06ejercicio4 {
	
	public static void main(String[] args) {
	
	int num=0;

			for (int i = 0; i < 20; i++) {
				
					num =(int)(Math.random()*11);// uno mas para incluir el 10
			
					System.out.print(num + " ");
					
			}
					
	
	
	
	}
}	
