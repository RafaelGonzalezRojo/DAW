/**Escribe un programa que nos diga el horóscopo a partir del día y el mes de nacimiento.*/


import java.util.Scanner;

public class C04ejercicio10 {
	
	public static void main(String[] args) {
			
			System.out.print("Horoscopo introduce dia y mes para saberlo \n");
			Scanner s = new Scanner(System.in);
			System.out.print("Introduce un mes : ");
			
			String opcion = (s.nextLine()).toLowerCase();
			
			System.out.print("Introduce un dia : ");
			
			int dia = Integer.parseInt(s.nextLine());
			
			if(dia <= 31){

			switch (opcion) {
			case "enero":
				if(dia <= 19){
						
				System.out.print("\n Capricornio ");
				
				}else{
					
				System.out.print("\n Acuario ");
					
				}		
			
			break;
			
			case "febrero":
				if(dia <= 17){
				System.out.print("\n Acuario");
				}else{
					
				System.out.print("\n Piscis");	
				}
			break;
				
			case "marzo":
				if(dia <= 19){
				System.out.print("\n Piscis");
				}else{
					
				System.out.print("\n Aries");	
				}		
				
			break;
			
			case "abril":
				if(dia <= 19 ){
				System.out.print("\n Aries");
				}else{
					
				System.out.print("\n Tauro");	
				}		
				
			break;
			
			case "mayo":
				if(dia <= 19){
				System.out.print("\n Tauro ");
				}else{
					
				System.out.print("\n Geminis");	
				}		
				
			break;
			
			
			
			case "junio":
				if(dia <= 21 ){
				System.out.print("\n Geminis ");
				}else{
					
				System.out.print("\n Cancer");	
				}		
				
			break;
			
			
			case "julio":
				if(dia <= 22 ){
				System.out.print("\n Cancer ");
				}else{
					
				System.out.print("\n  Leo");	
				}		
				
			break;
			
				case "agosto":
				if(dia <= 22 ){
				System.out.print("\n Cancer ");
				}else{
					
				System.out.print("\n  Virgo");	
				}		
				
			break;
			
			
			case "septiembre":
				if(dia <= 22 ){
				System.out.print("\n Virgo ");
				}else{
					
				System.out.print("\n Libra");	
				}		
				
			break;
			
			case "octubre":
				if(dia <= 22 ){
				System.out.print("\n libra ");
				}else{
					
				System.out.print("\n Escorpio");	
				}		
				
			break;
			
			case "noviembre":
				if(dia <= 22 ){
				System.out.print("\n Escorpio ");
				}else{
					
				System.out.print("\n Sagitrio");	
				}		
				
			break;
			
			case "diciembre":
				if(dia <= 21 ){
				System.out.print("\n Sagitario ");
				}else{
					
				System.out.print("\n Capricornio");	
				}		
				
			break;
			
			

			
			default:
			System.out.print("\nLo siento, la opción elegida no es correcta.");
			}
		}else{
			
		System.out.print("\nLo siento, el numero de dia del mes elegida no es correcta.");	
		
		}		
	}
}
