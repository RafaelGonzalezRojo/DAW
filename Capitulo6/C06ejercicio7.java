/**Escribe un programa que muestre tres apuestas de la quiniela en tres columnas para los 14
partidos y el pleno al quince (15 filas).**/

import java.util.Scanner;

public class C06ejercicio7 {
	
	public static void main(String[] args) {
	
	int num=0;
	
		for (int fila = 1; fila < 16; fila++) {
				System.out.print("\n");	
				System.out.print(fila + "._\t");	
			if(fila == 15){//pleno al quince
				num =(int)(Math.random()*3 + 1);	
							if(num == 1){
							System.out.print("[1] [ ] [ ] \t");	
							}	
							if(num == 2){
							System.out.print("[ ] [x] [ ] \t");	
							}		
							if(num == 3){
							System.out.print("[ ] [ ] [2] \t");	
							}		
				
			}else{//demas apuestas
					for (int apuesta = 1; apuesta <= 3; apuesta++) {	
						
						num =(int)(Math.random()*3 + 1);	
							if(num == 1){
							System.out.print("[1] [ ] [ ] \t");	
							}	
							if(num == 2){
							System.out.print("[ ] [x] [ ] \t");	
							}		
							if(num == 3){
							System.out.print("[ ] [ ] [2] \t");	
							}			
							
					}
			}
		}//acaba for			
					
					
					
	
	
	
	}
}	
