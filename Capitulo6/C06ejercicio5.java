/**Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos) separados por
espacios. Muestra también el máximo, el mínimo y la media de esos números.**/

import java.util.Scanner;

public class C06ejercicio5 {
	
	public static void main(String[] args) {
	
	int num=0;
	int maximo=0;
	int minimo=200;
	int suma = 0;
			for (int i = 1; i < 51; i++) {
				
					num =(int)(Math.random()*100 + 100);// 100 posiciones del 100 al 199 y se suma 100 para comenzar
			
					System.out.print(num + " ");
						
					if(num > maximo){
					maximo = num;	
						
					}		
					if(num < minimo){
					minimo = num;		
					}	
					
					suma = num + suma;	
			}
					
					
					
					System.out.print("\nnumero maximo: " + maximo + "\n");
					System.out.print("numero minimo: " + minimo + "\n");
					System.out.print("numero media: " + suma/50 + "\n");
	
	
	
	}
}	
