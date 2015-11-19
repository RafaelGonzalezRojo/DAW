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
						int dibujolinea =0;
						for(int planta=0 ; planta<=altura -1 ; planta++){
						
							
							for(espacio=altura; espacio>=planta; espacio--){
							
									System.out.print(" ");
							}
							
							for(dibujolinea=0 ; dibujolinea<=planta * 2 ; dibujolinea++){
							
									System.out.print("*");
							}
							
							
							System.out.print("\n");
							
							
						}
						
						
						
			
	}
}
