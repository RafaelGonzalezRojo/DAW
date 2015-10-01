
/**Escribe un programa en el que se declaren las variables enteras x e y . Asignales los valores
*144 y 999 respectivamente. A continuación, muestra por pantalla el valor de cada variable,
*la suma, la resta, la división y la multiplicación.
* Sarcasticboy Rafael Gonzalez Rojo
* */



public class C02ejercicio1 {
public static void main(String[] args) {

 int x = 144;
 int y = 999;

	System.out.print("la suma de " + x + " y " + y + " es: " +(x + y) + "\n");
	System.out.print("la resta de " + y + " y " + x + " es: " + (y - x)+ "\n");
	System.out.print("la multiplicacion de " + x + " y "+ y + " es: " + (x * y) + "\n");
	System.out.print("la division de " + y + " y " + x + " es: " + ((double)y /(double)x) + "\n");

	
	}

}
