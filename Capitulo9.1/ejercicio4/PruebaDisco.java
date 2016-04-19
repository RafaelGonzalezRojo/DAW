/**Modifica el programa “Colección de discos” como se indica a continuación:
 * 
a) Mejora la opción “Nuevo disco” de tal forma que cuando se llenen todas las posiciones
del array, el programa muestre un mensaje de error. No se permitirá introducir los datos
de ningún disco hasta que no se borre alguno de la lista.
* 
b) Mejora la opción “Borrar” de tal forma que se verifique que el código introducido por el
usuario existe.
* 
c) Modifica el programa de tal forma que el código del disco sea único, es decir que no se
pueda repetir.
* 
d) Crea un submenú dentro dentro de “Listado” de tal forma que exista un listado completo,
un listado por autor (todos los discos que ha publicado un determinado autor), un listado
por género (todos los discos de un género determinado) y un listado de discos cuya duración
esté en un rango determinado por el usuario.**/
import java.util.Scanner;
public class PruebaDisco{
	
	// N determina el tamaño del array
	static int N = 5;
	
	public static void main(String[] args) {
	 
	   //Crea el array de discos
    Disco[] album = new Disco[N];

    // Crea todos los discos que van en cada una de
    // las celdas del array
    for(int i = 0; i < N; i++) {
      album[i] = new Disco();
    }

    int opcion;
    String codigoIntroducido;
    String autorIntroducido;
    String tituloIntroducido;
    String generoIntroducido;
    String duracionIntroducidaString;
    int duracionIntroducida;
    int primeraLibre;
    int i;
	
	 do {
      System.out.println("\n\nCOLECCIÓN DE DISCOS");
      System.out.println("===================");
      System.out.println("1. Listado");
      System.out.println("2. Nuevo disco");
      System.out.println("3. Modificar");
      System.out.println("4. Borrar");
      System.out.println("5. Salir");
      System.out.print("Introduzca una opción: ");
      opcion = Integer.parseInt(System.console().readLine());
      
      switch (opcion) {
      case 1:
        System.out.println("\nLISTADO");
        System.out.println("=======");
        for(i = 0; i < N; i++) {
          if (!album[i].getCodigo().equals("LIBRE")) {
            System.out.println(album[i]);
          }
        }
        break;
        
      case 2:
        System.out.println("\nNUEVO DISCO");
        System.out.println("===========");
        
        // Busca la primera posición libre del array

        primeraLibre = -1;
        boolean codigolibre = false;
        do {	
			primeraLibre++;
			 System.out.println(primeraLibre);
			if((album[primeraLibre].getCodigo()).equals("LIBRE")){
				codigolibre = true; //comprueba en cada interaccio que uno de los codigos sea igual al usuario
			}	
			
		}while (!(album[primeraLibre].getCodigo()).equals("LIBRE"));
		
       if(codigolibre && (primeraLibre<=4)){
				System.out.println("Por favor, introduzca los datos del disco.");  
        
				System.out.print("Código: ");
				codigoIntroducido = System.console().readLine();
				album[primeraLibre].setCodigo(codigoIntroducido);
				
				System.out.print("Autor: ");
				autorIntroducido = System.console().readLine();
				album[primeraLibre].setAutor(autorIntroducido);
				
				System.out.print("Título: ");
				tituloIntroducido = System.console().readLine();
				album[primeraLibre].setTitulo(tituloIntroducido);
				
				System.out.print("Género: ");
				generoIntroducido = System.console().readLine();
				album[primeraLibre].setGenero(generoIntroducido);
				
				System.out.print("Duración: ");
				duracionIntroducida = Integer.parseInt(System.console().readLine());
				album[primeraLibre].setDuracion(duracionIntroducida);
			 
		}else{
			System.out.println("Por favor, borre algun dico falta espacio en el programa para añadir un nuevo disco."); 
			
		}			
       
        
        break;
        
      case 3:
        System.out.println("\nMODIFICAR");
        System.out.println("===========");
        
        System.out.print("Por favor, introduzca el código del disco cuyos datos desea cambiar: ");
        codigoIntroducido = System.console().readLine();
  
        i = -1;
        do {
          i++;
        } while (!((album[i].getCodigo()).equals(codigoIntroducido)));
        
        System.out.println("Introduzca los nuevos datos del disco o INTRO para dejarlos igual.");
  
        System.out.println("Código: " + album[i].getCodigo());
        System.out.print("Nuevo código: ");
        codigoIntroducido = System.console().readLine();
        if (!codigoIntroducido.equals("")) {
          album[i].setCodigo(codigoIntroducido);
        }
        
        System.out.println("Autor: " + album[i].getAutor());
        System.out.print("Nuevo autor: ");
        autorIntroducido = System.console().readLine();
        if (!autorIntroducido.equals("")) {
          album[i].setAutor(autorIntroducido);
        }
        
        System.out.println("Título: " + album[i].getTitulo());
        System.out.print("Nuevo título: ");
        tituloIntroducido = System.console().readLine();
        if (!tituloIntroducido.equals("")) {
          album[i].setTitulo(tituloIntroducido);
        }
        
        System.out.println("Género: " + album[i].getGenero());
        System.out.print("Nuevo género: ");
        generoIntroducido = System.console().readLine();
        if (!generoIntroducido.equals("")) {
          album[i].setGenero(generoIntroducido);
        }
        
        System.out.println("Duración: " + album[i].getDuracion());
        System.out.print("Duración: ");
        duracionIntroducidaString = System.console().readLine();
        if (!duracionIntroducidaString.equals("")) {
          album[i].setDuracion(Integer.parseInt(duracionIntroducidaString));
        }
        
        break;
        
      case 4:
        System.out.println("\nBORRAR");
        System.out.println("======");
        
        System.out.print("Por favor, introduzca el código del disco que desea borrar: ");
        codigoIntroducido = System.console().readLine();
  
        i = -1;
        boolean codigocorrecto = false;
        do {
          i++;
          if((album[i].getCodigo()).equals(codigoIntroducido)){
			codigocorrecto = true; //comprueba en cada interaccio que uno de los codigos sea igual al usuario
			}
        } while ((!((album[i].getCodigo()).equals(codigoIntroducido)))&& 4<=i);//importante controlar el numero de celdas del  para que no salga el mensaje de error de  Out noseke su puta madre (vaya  fallo por pasarse de recorrido)
         
        if(codigocorrecto){ //si es verdadero anterior mente se procedera a la eliminacion sino dira el mensaje del else
        album[i].setCodigo("LIBRE");
        System.out.println("Album borrado.");
		}else{
		System.out.println("el usuario ha insertado un codigo de disco inexistente");	
		}	
        
        break;
        
      default:
      
      } // switch
    } while (opcion != 5);
	
	}	
}	
	
