/**Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas que se imparten
en el curso. Cada pregunta acertada sumará un punto. El programa mostrará al final la
calificación obtenida. Pásale el minicuestionario a tus compañeros y pídeles que lo hagan
para ver qué tal andan de conocimientos en las diferentes asignaturas del curso.
*/

import java.util.Scanner;

public class C04ejercicio12 {
	
	public static void main(String[] args) {
			
			int cont = 1;
			Scanner s = new Scanner(System.in);
			System.out.print(" Cuestionario de preguntas de conocimientos DAW \n ");	
			
			System.out.print(" Las variables cambian su contenido \n");
			System.out.print("1) no no lo cambia \n");
			System.out.print("2) si lo cambian \n");
			System.out.print("3) depende del lenguaje  \n");
			
			int respuesta = Integer.parseInt(s.nextLine());
			
			if(respuesta == 2){
				
					cont++;
				
			}	
			
			
				System.out.print(" como se llama el profesor de programacion\n");
			System.out.print("1) String nombreprofesor : \n");
			System.out.print("2) Luis: \n");
			System.out.print("3) Jose luis : \n");
			
			respuesta = Integer.parseInt(s.nextLine());
			
			if(respuesta == 3){
				
					cont++;
				
			}	
			
			
			
				System.out.print(" el lenguaje que utilizamos es \n");
			System.out.print("1) Ubuntu \n");
			System.out.print("2) Javascript \n");
			System.out.print("3) Java \n");
			
			respuesta = Integer.parseInt(s.nextLine());
			
			if(respuesta == 3){
				
					cont++;
				
			}	
			
				System.out.print("Un ordenado para fucionar necesita \n");
			System.out.print("1) solo la ram: \n");
			System.out.print("2) ram cpu y disco duro: \n");
			System.out.print("3) ram y cpu : \n");
			
			respuesta = Integer.parseInt(s.nextLine());
			
			if(respuesta == 3){
				
					cont++;
				
			}	
			
			
				System.out.print("el css para  que sirve \n");
			System.out.print("1) para dar estilo a una pagina html \n");
			System.out.print("2) es otro lenguaje de programacion  \n");
			System.out.print("3) para solo mover cajas dentro de la pagina \n");
			
			respuesta = Integer.parseInt(s.nextLine());
			
			if(respuesta == 1){
				
					cont++;
				
			}	
			
			
				System.out.print(" el if sirve para \n");
			System.out.print("1) lo mismo que el else \n");
			System.out.print("2) para seleccionar uno o otro camino en la programacion \n");
			System.out.print("3) para sacar por pantalla \n");
			
			respuesta = Integer.parseInt(s.nextLine());
			
			if(respuesta == 2){
				
					cont++;
				
			}	
			
			
				System.out.print(" el else es \n");
			System.out.print("1) otro caso \n");
			System.out.print("2) igual que if \n");
			System.out.print("3) else no lo utilizo para eso esta el if \n");
			
			respuesta = Integer.parseInt(s.nextLine());
			
			if(respuesta == 1){
				
					cont++;
				
			}	
			
				System.out.print("los swicht pueden tener \n");
			System.out.print("1) varios casos \n");
			System.out.print("2) ningun caso \n");
			System.out.print("3) solo un caso \n");
			
			respuesta = Integer.parseInt(s.nextLine());
			
			if(respuesta == 1){
				
					cont++;
				
			}	
			
			
				System.out.print("las bases de datos tienen... \n");
			System.out.print("1) hojas \n");
			System.out.print("2) entidades \n");
			System.out.print("3) css \n");
			
			 respuesta = Integer.parseInt(s.nextLine());
			
			if(respuesta == 2){
				
					cont++;
				
			}	
			
			
			
				System.out.print(" las bases de datos se relacionan con\n");
			System.out.print("1) con relaciones binarias y n-arias \n");
			System.out.print("2) con relaciones binarias \n");
			System.out.print("3) con relaciones n-arias \n");
			
			 respuesta = Integer.parseInt(s.nextLine());
			
			if(respuesta == 2){
				
					cont++;
				
			}	
			
			
			
			
			System.out.print("La puntuacion de el test: "  + cont);
			
	}
}
