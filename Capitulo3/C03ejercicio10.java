
/**Realiza un conversor de Mb a Kb.
*/



import java.util.Scanner;
public class C03ejercicio10 {
	
	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.print("Introduce tus megas : ");
			int megas = Integer.parseInt(s.nextLine());
			
			
			
			System.out.printf ("los kb totales son : %d  Kb \n" , (megas * 1024));
			
			}
}
