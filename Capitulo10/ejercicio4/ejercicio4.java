/**Realiza un programa equivalente al anterior pero en esta ocasión, el programa debe ordenar
palabras en lugar de números.**/

import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;
public class ejercicio4{
	public static void main(String[] args) {ArrayList<String> a = new ArrayList<String>();
		System.out.println("\nIntroduce 10 palabras:");
		for (int i=0;i < 10;i++){
			System.out.println("\nIntroduce palabra por favor: ");
			Scanner s = new Scanner(System.in);
			String palabra = s.nextLine();
			a.add(palabra);
		}
		System.out.println("\nPalabras en el orden original:");
		for (String word: a) {
			System.out.println(word);
		}
		Collections.sort(a);
		System.out.println("\nPalabras ordenados:");
		for (String word: a) {
			System.out.println(word);
		}
	}
}
