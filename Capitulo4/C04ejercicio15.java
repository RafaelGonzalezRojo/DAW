/**Escribe un programa que pinte una pirámide rellena con un carácter introducido por
teclado que podrá ser una letra, un número o un símbolo como *, +, -, $, &, etc. El programa
debe permitir al usuario mediante un menú elegir si el vértice de la pirámide está apuntando
hacia arriba, hacia abajo, hacia la izquierda o hacia la derecha.*/



import java.util.Scanner;

public class C04ejercicio15 {
	
	public static void main(String[] args) {
			
			String simbol;
			Scanner s = new Scanner(System.in);
			System.out.print("Introduce un la opcion de la piramide : \n");
			System.out.print("1) arriba \n");
			System.out.print("2) abajo \n");
			System.out.print("3) derecha \n");
			System.out.print("4) izquierda \n");
			int opcion = Integer.parseInt(s.nextLine());
			System.out.print("Introduce un icono o letra de la piramide : \n");
			simbol = (s.nextLine());

			switch (opcion) {
			case 1:
			
			System.out.print("  " + simbol +"\n ");
			System.out.print("" + simbol + simbol + simbol + "\n");
			System.out.print("" + simbol + simbol + simbol + simbol + simbol +"\n");
			
			
			break;
			
			case 2:
			System.out.print("" + simbol + simbol + simbol + simbol + simbol +"\n");
			System.out.print("" + simbol + simbol + simbol + "\n");
			System.out.print("  " + simbol +"\n ");
			
			break;
			
			case 3:
			System.out.print(" " + simbol +" \n");
			System.out.print(" " +simbol + simbol +" \n");
			System.out.print(" " + simbol + simbol + simbol +" \n");
			System.out.print(" " +simbol + simbol +" \n");
			System.out.print(" " + simbol +" \n");
			break;
			
			case 4:
			
			System.out.print("   " + simbol +" \n");
			System.out.print("  " +simbol + simbol +" \n");
			System.out.print(" " + simbol + simbol + simbol +" \n");
			System.out.print("  " +simbol + simbol +" \n");
			System.out.print("   " + simbol +" \n");
			break;
			
			
			
			default:
			System.out.print("\nLo siento, la opción elegida no es correcta.");
			}
	}
}
