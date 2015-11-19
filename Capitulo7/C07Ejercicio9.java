/**Realiza un programa que pida 8 números enteros y que luego muestre esos números junto
con la palabra “par” o “impar” según proceda.*/



import java.util.Scanner;

public class C07Ejercicio9{
public static void main(String[] args) {
int[] num; // se define num como un array de enteros
num = new int[8]; // se reserva espacio para 19 enteros

			//en vede 19 se puede poner x.length(siendo la x el array que sea) para que lo recorra automaticamente
		for(int cont2=0;cont2<num.length;cont2++){
					
					
				Scanner s = new Scanner(System.in);
						System.out.print("Introduce numero : ");
							
						num[cont2] = Integer.parseInt(s.nextLine());
						
		}	
			
		
		for (int cont=0; cont<num.length; cont++){ 
				
				if(num[cont]% 2 == 0){
					
					System.out.print(num[cont] + "par\n");
				}
				
				if(num[cont]% 2 != 0){
					
					System.out.print(num[cont] + "impar\n");
				}		
			
		}
		
	
	}
}
