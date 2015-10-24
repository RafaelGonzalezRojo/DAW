/**Realiza un programa que sume los 100 números siguientes a un número entero y positivo
introducido por teclado. Se debe comprobar que el dato introducido es correcto (que es un
número positivo).*/



import java.util.Scanner;

public class C05ejercicio17 {
	
	public static void main(String[] args) {
		
		
				int num = 0;
						
		do{
						
						int resultado =0;
						int suma=0;

						Scanner s = new Scanner(System.in);
						System.out.print("Introduce numero : ");
							
						num = Integer.parseInt(s.nextLine());
						suma = num;
						
						//para  hacer desde la posicion del numero hasta  los 100 siguientes
						
						for(int cont=num + 1; cont <= num + 100; cont++){
							

							
							suma = suma + cont;
							
						}
						
						resultado = suma;
						if( num >= 0){
						
						System.out.print("El resultado de la suma de los 100 siguientes es: " + resultado);	
							
						}	
						
				
						
					
			}while(num <= -1);
	}
}



