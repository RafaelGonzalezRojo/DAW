/**Amplía el programa anterior para que diga la nota del boletín (insuficiente, suficiente, bien,
notable o sobresaliente).*/

import java.util.Scanner;

public class C04ejercicio8 {
	
	public static void main(String[] args) {

			Scanner s = new Scanner(System.in);
			System.out.print("Introduce primera nota : ");
			double nota1 = Double.parseDouble(s.nextLine());

			System.out.print("Introduce segunda nota : ");
			double nota2 = Double.parseDouble(s.nextLine());
			
			System.out.print("Introduce tercera nota : ");
			double nota3 = Double.parseDouble(s.nextLine());

			double resultado = (nota1 + nota2 + nota3) / 3;

			System.out.printf("\n el resultado de la media es : %.2f  \n" , (double)(resultado));
			
			
		if(resultado <= 10){	
				
			if(resultado < 5){
				
				System.out.print("Insuficiente ");
				
			}else if(resultado == 5){
				
				
				System.out.print("Suficiente ");
				
			}else if((resultado >= 6) && (resultado <=7)){
				
				
				System.out.print("Bien ");
				
			}else if((resultado >= 8) && (resultado <=9)){			
			
				System.out.print("Notable ");
				
			}else{
				
				System.out.print("Sobresaliente ");
				
			}	
		}else{
			
			System.out.print("Error en el resultado de media no tiene canones  valoracion de 0 a 10 ");
		}		
	}	
}	
