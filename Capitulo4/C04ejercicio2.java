/**Realiza un programa que pida una hora por teclado y que muestre luego buenos días, buenas
tardes o buenas noches según la hora. Se utilizarán los tramos de 6 a 12, de 13 a 20 y de 21
a 5. respectivamente. Sólo se tienen en cuenta las horas, los minutos no se deben introducir
por teclado.*/
//para que funcione la entrad de teclado escaner
import java.util.Scanner;

public class C04ejercicio2 {
	
	public static void main(String[] args) {
			
			System.out.print(" Inserte una hora para saber que tiempo del dia estas ");	
			
			Scanner s = new Scanner(System.in);
			int hora = Integer.parseInt(s.nextLine());
			
		if(hora <= 24){	
			
			if((hora >= 6)&&(hora <= 12)){
			System.out.print(" Buenos dias ");	
				
			}else if((hora >= 13)&&(hora <= 20)){
				
			System.out.print(" Buenas tardes ");		
			}else{
			
			System.out.print(" Buenas noches ");		
				
			}		
		}else{
			
			System.out.print("Parametros incorrectos la hora no es correcta ");
			
		}	     		
			
	}			
}
