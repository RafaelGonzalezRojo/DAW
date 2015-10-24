/**Realiza el control de acceso a una caja fuerte. La combinación será un número de 4 cifras.
El programa nos pedirá la combinación para abrirla. Si no acertamos, se nos mostrará el
mensaje “Lo siento, esa no es la combinación” y si acertamos se nos dirá “La caja fuerte se
ha abierto satisfactoriamente”. Tendremos cuatro oportunidades para abrir la caja fuerte.*/


import java.util.Scanner;

public class C05ejercicio7 {
	
	public static void main(String[] args) {
		
	int codigocaja = 6969;	

	for(int cont= 1 ; cont <= 4; cont++ ){
			
		Scanner s = new Scanner(System.in);
			System.out.print("Introduce clave : ");
				
			int num = Integer.parseInt(s.nextLine());	
			
			if(num == codigocaja){
				
				System.out.print("La caja fuerte se ha abierto satisfactoriamente");
			
				cont = 4;
			}else{
				
				System.out.print("Lo siento, esa no es la combinación \n");	
			}		
			
			
		
	}			
			
	}
}
