/**Crea un ArrayList con los nombres de 6 compañeros de clase. A continuación, muestra
esos nombres por pantalla. Utiliza para ello un bucle for que recorra todo el ArrayList sin
usar ningún índice.**/


import java.util.ArrayList;
public class ejercicio1{
  public static void main(String[] args) {
	ArrayList<String> compi = new ArrayList<String>();
	compi.add("Angel");
	compi.add("Ojitos Azules");
	compi.add("Barbi");
	compi.add("Elena");
	compi.add("Brother Hermano 1");
	compi.add("Brother Hermano 2");
	System.out.println("Contenido de la lista: ");
	for(String companero: compi) {
		System.out.println(companero);
	}
  }
}
