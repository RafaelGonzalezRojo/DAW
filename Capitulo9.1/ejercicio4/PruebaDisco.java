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
    int opcionListado=0;
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
		do { //empieza do while para repetir las veces que haga falta diferentes listados
					System.out.println("\nLISTADO");
					System.out.println("=======");
					System.out.println("1. Completo");
					System.out.println("2. Por autor");
					System.out.println("3. Por género");
					System.out.println("4. En un rango de duración");
					System.out.println("5. Menú principal");
					System.out.print("Introduzca una opción: ");
					opcionListado = Integer.parseInt(System.console().readLine());				
					
					switch (opcionListado) {

						case 1:
							
							// Listado completo 
							
							for(i = 0; i < N; i++) {
								if (!album[i].getCodigo().equals("LIBRE")) {
									System.out.println("------------------------------------------");
									System.out.println("Código: " + album[i].getCodigo());	
									System.out.println("Autor: " + album[i].getAutor());		
									System.out.println("Título: " + album[i].getTitulo());
									System.out.println("Género: " + album[i].getGenero());
									System.out.println("Duración: " + album[i].getDuracion());
									System.out.println("------------------------------------------");
								}
							}
							
							break;
							
							
						case 2:
							
							// Listado por autor 
	
							System.out.print("Introduzca el autor: ");
							autorIntroducido = System.console().readLine();
							
							for(i = 0; i < N; i++) {
								if ( (!album[i].getCodigo().equals("LIBRE")) && (album[i].getAutor().equals(autorIntroducido)) ){
									System.out.println("------------------------------------------");
									System.out.println("Código: " + album[i].getCodigo());	
									System.out.println("Autor: " + album[i].getAutor());		
									System.out.println("Título: " + album[i].getTitulo());
									System.out.println("Género: " + album[i].getGenero());
									System.out.println("Duración: " + album[i].getDuracion());
									System.out.println("------------------------------------------");
								}
							}
							
							break;
							

						case 3:
							
							// Listado por género 
	
							System.out.print("Introduzca el género: ");
							generoIntroducido = System.console().readLine();
							
							for(i = 0; i < N; i++) {
								if ( (!album[i].getCodigo().equals("LIBRE")) && (album[i].getGenero().equals(generoIntroducido)) ){
									System.out.println("------------------------------------------");
									System.out.println("Código: " + album[i].getCodigo());	
									System.out.println("Autor: " + album[i].getAutor());		
									System.out.println("Título: " + album[i].getTitulo());
									System.out.println("Género: " + album[i].getGenero());
									System.out.println("Duración: " + album[i].getDuracion());
									System.out.println("------------------------------------------");
								}
							}
							
							break;

							
						case 4:
							
							// Listado en un rango de duración 
	
							System.out.println("Establezca el intervalo para la duración");
							System.out.print("Introduzca el límite inferior de duración en minutos: ");
							int limiteInferior = Integer.parseInt(System.console().readLine());
							System.out.print("Introduzca el límite superior de duración en minutos: ");
							int limiteSuperior = Integer.parseInt(System.console().readLine());
							
							for(i = 0; i < N; i++) {
								if ( (!album[i].getCodigo().equals("LIBRE")) && (album[i].getDuracion() <= limiteSuperior) && (album[i].getDuracion() >= limiteInferior) ){
									System.out.println("------------------------------------------");
									System.out.println("Código: " + album[i].getCodigo());	
									System.out.println("Autor: " + album[i].getAutor());		
									System.out.println("Título: " + album[i].getTitulo());
									System.out.println("Género: " + album[i].getGenero());
									System.out.println("Duración: " + album[i].getDuracion());
									System.out.println("------------------------------------------");
								}
							}
							
					} // switch (opcionListado)
					
					
					
				}while (opcionListado != 5);

        break;
        
      case 2:
        System.out.println("\nNUEVO DISCO");
        System.out.println("===========");
        
        // Busca la primera posición libre del array

        primeraLibre = -1;
        boolean codigolibre = false;
        do {	
          primeraLibre++;
          if((album[primeraLibre].getCodigo()).equals("LIBRE")){
          codigolibre = true; //comprueba en cada interaccio que uno de los codigos sea igual al usuario
          }	
			
        }while ((!codigolibre)&&primeraLibre<4);
       
          if(codigolibre){
          System.out.println("Por favor, introduzca los datos del disco.");  
      
          System.out.print("Código: ");
          codigoIntroducido = System.console().readLine();
          int codigounico = -1;
          boolean codigorepetido=false;
          do{
             codigounico++;
             if((album[codigounico].getCodigo()).equals(codigoIntroducido)){
                 codigorepetido=true;
             }  
          }while(codigounico<4);
          
          if(!codigorepetido){
            album[primeraLibre].setCodigo(codigoIntroducido);//introduce el codigo si no esta repetido
            
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
            System.out.println("Por favor,introduzca otro codigo ese codigo esta repetido");//es el otro  caso en caso que en el alta se introduzca un codigo repetido se detecta gracias a un booleano "codigo repetido"
          }    
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
       /** System.out.println("Código: " + album[i].getCodigo());
        System.out.print("Nuevo código: ");
        codigoIntroducido = System.console().readLine();
        if (!codigoIntroducido.equals("")) {
          album[i].setCodigo(codigoIntroducido);
        }
        **/ //lo comento ya que veo que el usuario puede generar errores de repeticion, para evitar repeticiones no dejare que modifique el codigo principal
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
          System.out.println("codigo de disco busqueda: " + album[i].getCodigo());
          if((album[i].getCodigo()).equals(codigoIntroducido)){
              codigocorrecto = true; //comprueba en cada interaccio que uno de los codigos sea igual al usuario
          }
          
        } while ((!codigocorrecto)&&i<4);//importante controlar el numero de celdas del  para que no salga el mensaje de error de  Out noseke su puta madre (vaya  fallo por pasarse de recorrido)
         
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
	
