/**
*Rafael Gonzalez Sarcasticboy
*Modifica el programa anterior añadiendo colores. Puedes mostrar cada asignatura de un
*color diferente.
*/

public class C01Ejercicio05 {
	public static void main(String[] args) {
		//colores variados		
		String morado = "\033[35m";
		String blanco = "\033[37m";
		String verde = "\033[32m";
		String naranja = "\033[33m";
		String azul = "\033[34m";
		String rojo = "\033[31m";


		System.out.print(morado + "Lunes " + "\t Martes" + "\tMiercoles" + "\tJueves" + "\tViernes \n");
		System.out.print(azul + "DWES " + naranja + "\t Prog" + azul + "\t DWES" + naranja +"\t\t Prog " + verde +"\t BD \n");
		System.out.print(azul + "DWES" + naranja + "\t Prog "+ azul + "\t DWES" + naranja + "\t\t Prog"+ verde + "\t BD \n");
		System.out.print(azul + "DWES " + naranja + "\t Prog "+ azul + "\t DWES" + naranja + "\t\t Prog"+ blanco +"\t DIW \n");
		System.out.print(naranja + "Prog" + verde + "\t BD " + rojo +"\t HLC" + morado + "\t\t EINEM"+ blanco +"\t DIW \n" );
		System.out.print(blanco + "DIW" +  verde + "\t BD " + rojo +"\t HLC" + morado + "\t\t EINEM"+ azul +"\t DWES \n");
		System.out.print(blanco + "DIW" +  verde + "\t BD " + rojo +"\t HLC" + morado + "\t\t EINEM"+ azul + "\t DWES \n" + blanco);
		
	}
}
