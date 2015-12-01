/**Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 y que los
almacene en un array. El programa debe ser capaz de pasar todos los números pares a las
primeras posiciones del array (del 0 en adelante) y todos los números impares a las celdas
restantes. Utiliza arrays auxiliares si es necesario.*/


import java.util.Scanner;

public class C07Ejercicio10{
public static void main(String[] args) {
int[] num; // se define num como un array de enteros
num = new int[20]; // se reserva espacio para 19 enteros
int[] aux;
aux = new int[20];	
int posicion = 0;
int random=0;
		for(int cont2=0;cont2<num.length;cont2++){
					
					random =(int)(Math.random()*100);
					num[cont2] = random;
			
		}	
			
		System.out.print("array original: \t"); 
		
		for (int cont=0; cont<num.length; cont++){ 		
				
					System.out.print(num[cont] + " ");
				
		}	
			
			
			
		//meto los pares se guarda la posicion
		for (int cont=0; cont<num.length; cont++){ 
				
				if(num[cont]% 2 == 0){
					
					aux[posicion] = num[cont];
					posicion++;
				}		
		
		}
		
		for (int cont=0; cont<num.length; cont++){ 
			
			
			if(num[cont]% 2 != 0){
				
				aux[posicion] = num[cont];
				posicion++; 				
			}
			
		}	
		
		System.out.print("\narray modificado: \t"); 
		
		for (int cont=0; cont<aux.length; cont++){ 
				
				
					System.out.print(aux[cont] + " ");
				
		}
	
	}
}
