/**Escribe un programa que ordene 10 números enteros introducidos por teclado y almacena-
dos en un objeto de la clase ArrayList .**/

import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;
public class ejercicio3{
	public static void main(String[] args) {ArrayList<Integer> a = new ArrayList<Integer>();
		System.out.println("\nIntroduce 10 numeros:");
		for (int i=0;i < 10;i++){
			System.out.println("\nIntroduce numero por favor: ");
			Scanner s = new Scanner(System.in);
			int opcion = Integer.parseInt(s.nextLine());
			a.add(opcion);
		}
		System.out.println("\nNúmeros en el orden original:");
		for (int numero: a) {
			System.out.println(numero);
		}
		Collections.sort(a);
		System.out.println("\nNúmeros ordenados:");
		for (int numero: a) {
			System.out.println(numero);
		}
	}
}
