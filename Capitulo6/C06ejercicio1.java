
/**Escribe un programa que muestre la tirada de tres dados. Se debe mostrar también la suma
total (los puntos que suman entre los tres dados).**/

import java.util.Scanner;

public class C06ejercicio1 {
	
	public static void main(String[] args) {
	
	int num=0;
	int suma=0;
			for (int i = 0; i < 3; i++) {
				
					num =(int)(Math.random()*6 + 1);
					System.out.println(num);
					suma = num + suma;	
					
			}
					System.out.println("la suma de los dados: " + suma);
	
	
	
	}
}	
