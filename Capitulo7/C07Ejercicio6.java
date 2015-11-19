
/**Escribe un programa que lea 15 números por teclado y que los almacene en un array. Rota
los elementos de ese array, es decir, el elemento de la posición 0 debe pasar a la posición
1, el de la 1 a la 2, etc. El número que se encuentra en la última posición debe pasar a la
posición 0. Finalmente, muestra el contenido del array.*/

import java.util.Scanner;

public class C07Ejercicio6{
public static void main(String[] args) {
int[] num; // se define num como un array de enteros
int[] aux;
num = new int[15]; // se reserva espacio para 19 enteros
aux = new int[15];
			//en vede 15 se puede poner x.length(siendo la x el array que sea) para que lo recorra automaticamente
		for(int cont2=0;cont2<num.length;cont2++){
					
					
				Scanner s = new Scanner(System.in);
						System.out.print("Introduce numero : ");
							
						num[cont2] = Integer.parseInt(s.nextLine());
						
		}	
		
		
		//guardado de ultima posicion intercambio	
		aux[0]= num[14];
		
		
		//recorre desde posicion 1 hasta el final del array num -1 una posicion la 15 no entraria
		for (int cont=1; cont<num.length; cont++){ 
				
			  aux[cont] = num[cont - 1];
				
				
		}
		
	
		System.out.print(" narray original: "); 
		for (int cont=0; cont<num.length; cont++){ 
				
				
					System.out.print(num[cont] + " ");
				
		}
		
		System.out.print("\n");
		System.out.print("narray desplazado: ");
		for (int cont=0; cont<num.length; cont++){ 
				
				
					System.out.print(aux[cont] + " ");
				
		}
		
		
		
	}
}
