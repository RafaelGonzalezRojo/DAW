/**Realiza un programa que pinte una pirámide por pantalla. La altura se debe pedir por
teclado. El carácter con el que se pinta la pirámide también se debe pedir por teclado.*/



import java.util.Scanner;

public class C05ejercicio19 {
	
	public static void main(String[] args) {
		
		
						int altura = 0;
						
						Scanner s = new Scanner(System.in);
						System.out.print("Introduce altura : ");
							
						altura = Integer.parseInt(s.nextLine());
						int cont2=0;
						int espacio=0;
						int dibujo =0;
						for(int cont=1 ; cont<=altura ; cont++){
						
							
							for(espacio=altura; espacio>=cont -1 ; espacio--){
							
									System.out.print(" ");
							}
							
							for(dibujo=0 ; dibujo<=(cont -1) * 2 ; dibujo++){
							
									System.out.print("*");
							}
							
							
							System.out.print("\n");
							
							
						}
						
						
						
			
	}
}
