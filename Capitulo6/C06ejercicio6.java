/**Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe adivinarlo
y tiene para ello 5 oportunidades. Después de cada intento fallido, el programa dirá cuántas
oportunidades quedan y si el número introducido es menor o mayor que el número secreto.**/

import java.util.Scanner;

public class C06ejercicio6 {
	
	public static void main(String[] args) {
	
	int num=0;
	int numsecret=0;
	boolean acertado=false;
			
				
					numsecret =(int)(Math.random()*100);// 100 posiciones del 100 al 199 y se suma 100 para comenzar
			
					System.out.print(" mun secret: "+ numsecret + " ");//comentar para jugar al numero secreto se dejaba para comprobaciones
		for (int i = 1; i < 6; i++) {				
					
					
						Scanner s = new Scanner(System.in);
						System.out.print("\nIntroduce numero : ");
						 num = Integer.parseInt(s.nextLine());
						if (numsecret == num){
							System.out.print("\nhas acertado !!");
							i=6;//para cortar el bucle
							acertado = true;
						}else{
							
							if(num > numsecret){
							
								System.out.print("\nel numero introducido es mayor");
								
							}else{
								
								System.out.print("\nel numero introducido es menor");
							}			
								
							
						}	
						
			}//acaba for
			
			if(!acertado){		
				System.out.print("\nLo siento se ha quedado sin intentos");		
			}		
				
	
	
	}
}	
