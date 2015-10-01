
/**Realiza un conversor de kb a mb.
*/



import java.util.Scanner;
public class C03ejercicio11 {
	
	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.print("Introduce tus kilobytes : ");
			int kilo = Integer.parseInt(s.nextLine());
			
			
			
																	
			System.out.printf ("los Mb totales son : %d  Mb \n" , (kilo / 1024));
			
			}
}
