/**Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja de 40 cartas:
2, 3, 4, 5, 6, 7, sota, caballo, rey y as.**/

import java.util.Scanner;

public class C06ejercicio3 {
	
	public static void main(String[] args) {
	
	int carta=0;
	int palo=0;
		
			
	carta =(int)(Math.random()*10 + 1);
			
					
	switch(carta) {
				case 1:
				System.out.print("As o 1");
				break;
				case 2:
				System.out.print("2");
				break;
				case 3:
				System.out.print("3");
				break;
				case 4:
				System.out.print("4");
				break;
				case 5:
				System.out.print("5");
				break;
				case 6:
				System.out.print("6");
				break;
				case 7:
				System.out.print("7");
				break;
				case 8:
				System.out.print("Sota");
				break;
				case 9:
				System.out.print("Caballo");
				break;
				case 10:
				System.out.print("Rey");
				break;
				
				default:			
			}
	
	

	
	palo =(int)(Math.random()*4 + 1);		
							
	
		
			if(palo ==1){
				System.out.println(" Bastos");
			}
			if(palo==2){
				System.out.println(" Oros");
			}
			if(palo==3){
				System.out.println(" Copas");
			}
			if(palo==4){
				System.out.println(" Espadas");
			}
			
	
	
	}
}	
