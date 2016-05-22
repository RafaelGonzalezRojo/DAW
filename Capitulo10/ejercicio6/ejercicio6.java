/**Implementa el control de acceso al área restringida de un programa. Se debe pedir un
nombre de usuario y una contraseña. Si el usuario introduce los datos correctamente,
el programa dirá “Ha accedido al área restringida”. El usuario tendrá un máximo de 3
oportunidades. Si se agotan las oportunidades el programa dirá “Lo siento, no tiene acceso
al área restringida”. Los nombres de usuario con sus correspondientes contraseñas deben
estar almacenados en una estructura de la clase HashMap.**/

import java.util.Scanner;
import java.util.*;
public class ejercicio6 {
  public static void main(String[] args) {
    HashMap<String, String> usuarios = new HashMap<String, String>();
    usuarios.put("Amalia Núñez","921");
    usuarios.put("Cindy Nero", "111");
    usuarios.put("César Vázquez", "121");
    usuarios.put("Víctor Tilla","999");
    usuarios.put("Alan Brito", "116");
    usuarios.put("Esteban Quito", "145");
    
    int intentos=0;
    boolean acceso=false;
    do{
        System.out.print("Por favor, introduzca un usuario: ");
        Scanner s = new Scanner(System.in);
        String usuario = s.nextLine();
        
        System.out.print("Por favor, introduzca un código: ");
        String clave = s.nextLine();
        
        //comprobaciones
      
      
        if((usuarios.get(usuario)).equals(clave)){//compara el usuario que en este caso es el indice ej: Alan brito saca su valor con el get y lo compara con lo introducido con el usuario
          System.out.println("los datos son correctos");
          acceso=true;
          intentos=3;
        } else {
          System.out.println("Los datos no son correctos");
          intentos++;
        }
    }while((intentos<3) && (!acceso));
    
     if(!acceso){ 
        System.out.println("Lo siento, no tiene acceso al área restringida");
      }else{
         System.out.println("Ha accedido al área restringida");
     }   
  }
}
