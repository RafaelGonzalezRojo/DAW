/**Escribe un programa que pida 10 números por teclado y que luego muestre los números
introducidos junto con las palabras “máximo” y “mínimo” al lado del máximo y del mínimo
respectivamente.*/


import java.util.Scanner;

public class C07Ejercicio5{
public static void main(String[] args) {
int[] num; // se define num como un array de enteros
num = new int[10]; // se reserva espacio para 19 enteros
int nummayor=0;
int nummenor=9999;
			//en vede 19 se puede poner x.length(siendo la x el array que sea) para que lo recorra automaticamente
		for(int cont2=0;cont2<num.length;cont2++){
					
					
				Scanner s = new Scanner(System.in);
						System.out.print("Introduce numero : ");
							
						num[cont2] = Integer.parseInt(s.nextLine());
						
		}	
			
		
		for (int cont=0; cont<num.length; cont++){ 
				
				if(num[cont]>nummayor){
					
					nummayor= num[cont];
				}
				
				if(num[cont]<nummenor){
					
					nummenor= num[cont];
				}		
			
		}
		
		for (int cont=0; cont<num.length; cont++){ 
				
				if(num[cont]==nummayor){
					
					System.out.print(num[cont] + " maximo \n");
				}else if(num[cont]==nummenor){
				
					System.out.print(num[cont] + " minimo \n");
				}else{
					System.out.print(num[cont] + "\n");
				}		
			
		}
	}
}
