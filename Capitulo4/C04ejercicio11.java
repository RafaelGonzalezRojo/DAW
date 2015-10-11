/**Escribe un programa que dada una hora determinada (horas y minutos), calcule los
segundos que faltan para llegar a la medianoche.*/

import java.util.Scanner;

public class C04ejercicio11 {
	
	public static void main(String[] args) {
			
			System.out.print(" Inserte una hora y minuto para saber cuanto queda para la media noche \n ");	
			
			Scanner s = new Scanner(System.in);
			System.out.print("inserte hora: \n");
			int hora = Integer.parseInt(s.nextLine());
			System.out.print("inserte minutos: \n");
			int minutos = Integer.parseInt(s.nextLine());
			int resultado = 0;
			int resultado2 = 0;
		if((hora <= 23) && (minutos <= 60)){
			
			resultado =  23 - hora; 
			
			resultado2 =  60 - minutos;
			
			
		}
		
		System.out.print("quedan horas: " + resultado + " para la media noche \n");	
		
		System.out.print("quedan minutos: " + resultado2 + " para la media noche \n");
		
		resultado = resultado * 60 * 60;
			
		resultado2 = resultado2 * 60;
		
		resultado = resultado + resultado2; 
		
		System.out.print("quedan segundos: " + resultado + " para la media noche");
	}			
}
