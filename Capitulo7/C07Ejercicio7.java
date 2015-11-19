/**Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los muestre
por pantalla separados por espacios. El programa pedirá entonces por teclado dos valores
y a continuación cambiará todas las ocurrencias del primer valor por el segundo en
la lista generada anteriormente. Los números que se han cambiado deben aparecer
entrecomillados.*/


import java.util.Scanner;

public class C07Ejercicio7{
public static void main(String[] args) {
int[] num; // se define num como un array de enteros
num = new int[20]; // se reserva espacio para 19 enteros
			//en vede 15 se puede poner x.length(siendo la x el array que sea) para que lo recorra automaticamente
int numbuscar;		
int numremplazar;				
int random;
		//genera numeros aleatorios
		for(int cont2=0;cont2<num.length;cont2++){
			random =(int)(Math.random()*100);
			num[cont2] = random;
		}	

		System.out.print("array original: "); 
		
		for (int cont=0; cont<num.length; cont++){ 
				
				
					System.out.print(num[cont] + " ");
				
		}
					
	
		Scanner s = new Scanner(System.in);
		System.out.print("\nIntroduce numero a selecionar: ");
			
		numbuscar = Integer.parseInt(s.nextLine());
		
		System.out.print("\nIntroduce numero a remplazar: ");
			
		numremplazar = Integer.parseInt(s.nextLine());
		
		System.out.print("\n");
		
		System.out.print(" array remplazado: "); 

		
		//busca la posicion y la intercambia
		for (int cont=0; cont<num.length; cont++){ 
				
			 if(numbuscar == num[cont]){
			
					num[cont] = numremplazar;
			System.out.print("[" + num[cont] + "]");
					
			}else{
				
			System.out.print(" " + num[cont]);
				
			}	
				
		}
		
	
		
	
		
		
		
	}
}

