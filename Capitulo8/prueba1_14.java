
import matematicas.De1a14;

import java.util.Scanner;

public class prueba1_14{
  public static void main(String[] args) {

    int opcion = 0;
    Scanner s = new Scanner(System.in);
    do { 

      System.out.print("\n opcion 0 para salir");
      System.out.print("\n opcion 1 comprobar capicua");
      System.out.print("\n opcion 2 voltear numero");
      System.out.print("\n opcion 3 detecta si es primo");
      System.out.print("\n opcion 4 devuelve el siguiente primo");
      System.out.print("\n opcion 5 potencia de un numero");
      System.out.print("\n opcion 6 cuenta digitos");
      System.out.print("\n opcion 7 quita por detras");
      System.out.print("\n opcion 8 quita por delante");
      System.out.print("\n opcion 9 posicionDeDigito te envia el numero buscado sino devuelve -1");
      System.out.print("\n opcion 10 DigitoN te busca un numero por posicion buscado sino devuelve -1");
      System.out.print("\n opcion 11 pegaPorDetras: Añade un dígito a un número por detrás.");
      System.out.print("\n opcion 12. pegaPorDelante: Añade un dígito a un número por delante.");
       System.out.print("\n opcion 13 trozoDeNumero: Toma como parámetros las posiciones inicial y final dentro de un número y devuelve el trozo correspondiente.");
       System.out.print("\n opcion 14 juntaNumeros: Pega dos números para formar uno");
      System.out.print("\n Introduce numero para opcion : ");
      opcion = Integer.parseInt(s.nextLine());
        switch (opcion) {
          case 1:
            System.out.print("Introduce numero para comprobar capicua: ");
            int num = Integer.parseInt(s.nextLine());
            if(matematicas.De1a14.esCapicua(num)){
              System.out.print("es capicua totalmente \n");

            }else{
              System.out.print("no es capicua totalmente comprobado \n");
            }
            break;
          case 2:
            System.out.print("Introduce numero para voltear : ");
            int num2 = Integer.parseInt(s.nextLine());
            System.out.print("numero volteado es: " + matematicas.De1a14.Volteado(num2) +"\n");

          break;
          
          case 3:
            System.out.print("Introduce numero para comprobar si es primo: ");
            int num3 = Integer.parseInt(s.nextLine());
            if(matematicas.De1a14.esPrimo(num3)){
              System.out.print("es primo totalmente \n");

            }else{
              System.out.print("no es primo totalmente comprobado \n");
            }
            break;
            
          case 4:
          
            System.out.print("Introduce numero para su siguiente primo : ");
            int num4 = Integer.parseInt(s.nextLine());
            System.out.print("numero primo siguiente es: " + matematicas.De1a14.esPrimoSiguiente(num4) +"\n");

          break; 
          
          case 5:
          
            System.out.print("Introduce un número entero positivo base: ");
            int n = Integer.parseInt(s.nextLine());
            System.out.print("Introduce un número entero positivo exponente: ");
            int e = Integer.parseInt(s.nextLine());
            System.out.print("su potencia es: " + matematicas.De1a14.Potencia(n,e) +"\n");
          break; 
          
          case 6:
          
            System.out.print("Introduce numero para contar sus cifras : ");
            int num6 = Integer.parseInt(s.nextLine());
            System.out.print("los digitos que tiene son: " + matematicas.De1a14.Digitos(num6) +"\n");

          break; 
          
          case 7:
          
            System.out.print("Introduce numero: ");
            int num7 = Integer.parseInt(s.nextLine());
            System.out.print("Introduce el numero de cifras que quieres quitarle : ");
            int c = Integer.parseInt(s.nextLine());
            System.out.print("con los digitos quitados seria: " + matematicas.De1a14.Quitadetras(num7,c) +"\n");

          break; 
          
          
          case 8:
          
            System.out.print("Introduce numero: ");
            int num8 = Integer.parseInt(s.nextLine());
            System.out.print("Introduce el numero de cifras que quieres quitarle : ");
            int c2 = Integer.parseInt(s.nextLine());
            System.out.print("con los digitos quitados seria: " + matematicas.De1a14.Quitadelante(num8,c2) +"\n");

          break; 
          
          case 9:
          
            System.out.print("Introduce numero: ");
            int num9 = Integer.parseInt(s.nextLine());
            System.out.print("Introduce el numero que deseas buscar : ");
            int b = Integer.parseInt(s.nextLine());
            System.out.print("con la posicion del digito es: " + matematicas.De1a14.PosicionDeDigito(num9,b) +"\n");

          break; 
          
          //Devuelve el dígito que está en la posición n de un número entero. Se empieza contando por el 0 y de izquierda a derecha.
           case 10:
          
            System.out.print("Introduce numero: ");
            int num10 = Integer.parseInt(s.nextLine());
            System.out.print("Introduce la posicion del numero que deseas sacar : ");
            int b2 = Integer.parseInt(s.nextLine());
            System.out.print("el digito es: " + matematicas.De1a14.DigitoN(num10,b2) +"\n");

          break; 
          
          case 11:
          
            System.out.print("Introduce numero: ");
            int num11 = Integer.parseInt(s.nextLine());
            System.out.print("Introduce numeros por detras que deseas poner : ");
            int pega = Integer.parseInt(s.nextLine());
            System.out.print("numero compuesto: " + matematicas.De1a14.PonDetras(num11,pega) +"\n");

          break; 
          
           case 12:
          
            System.out.print("Introduce numero: ");
            int num12 = Integer.parseInt(s.nextLine());
            System.out.print("Introduce numeros por delante que deseas poner : ");
            int pega2 = Integer.parseInt(s.nextLine());
            System.out.print("numero compuesto: " + matematicas.De1a14.PonDelante(num12,pega2) +"\n");

          break; 
          
           case 13:
            
            System.out.print("Introduce numero: ");
            int num13 = Integer.parseInt(s.nextLine());
            System.out.print("Introduce posicon inicial : ");
            int inicial = Integer.parseInt(s.nextLine());
             System.out.print("Introduce posicon final : ");
            int finalnum = Integer.parseInt(s.nextLine());
            System.out.print("numero trozo: " + matematicas.De1a14.TrozoNumero(num13,inicial,finalnum) +"\n");

            
            
           break;
          
          
           case 14: 
            System.out.print("Introduce numero: ");
            int num14 = Integer.parseInt(s.nextLine());
            System.out.print("Introduce el otro numero: ");
            int otronum = Integer.parseInt(s.nextLine());
            System.out.print("numero compuesto: " + matematicas.De1a14.JuntaNumeros(num14,otronum) +"\n");

          break; 
          
          
        }  
    //poner donde se encuentra la funcion exactamente /matematicas ejer De1a14 y por ultimo la funcion esCapicua

    }while(opcion != 0);
  } 
}  
