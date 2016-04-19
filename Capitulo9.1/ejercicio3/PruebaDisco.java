/**Realiza el programa “Colección de discos” por tu cuenta, mirando lo menos posible el
ejemplo que se proporciona. Pruébalo primero para ver cómo funciona y luego intenta
implementarlo tú mismo.**/
import java.util.Scanner;
public class PruebaDisco{
	public static void main(String[] args) {

		//creacion de disco
		Disco Metallica = new Disco();
		
		//rellana los datos del disco
		//introduce los datos mediante el set no tiene un constructor para poner todos los datos de una vez//
		Metallica.setCodigo("Ocupado");
		Metallica.setAutor("Metallica");
		Metallica.setGenero("Metal");
		Metallica.setTitulo("Else Matters");
		Metallica.setDuracion(210);
		
		//toString saca todos los datos del disco
		System.out.print(Metallica);
		
		//modifico la duracion
		
		Metallica.setDuracion(180);
		
		//toString saca todos los datos del disco pero esta vez ya con la duracion modificada
		System.out.print(Metallica);
		
		System.out.print("\nEstado de Disco: "  + Metallica.getCodigo());// consulto el estado haciendo el get a su Codigo
	}	
}	
	
