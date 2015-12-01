/**Realiza un programa que pida 10 números por teclado y que los almacene en un array. A
continuación se mostrará el contenido de ese array junto al índice (0 – 9). Seguidamente el
programa pedirá dos posiciones a las que llamaremos “inicial” y “final”. Se debe comprobar
que inicial es menor que final y que ambos números están entre 0 y 9. El programa deberá
colocar el número de la posición inicial en la posición final, rotando el resto de números
para que no se pierda ninguno. Al final se debe mostrar el array resultante.
Por ejemplo, para inicial = 3 y final = 7:*/



import java.util.Scanner;

public class C07Ejercicio12{
  public static void main(String[] args) {
    int[] num; // se define num como un array de enteros
    num = new int[10]; // se reserva espacio para 19 enteros
    int[] aux;
    aux = new int[10];
    int posicioninicial=0;
    int posicionfinal=0;

    //en vez de 10 se puede poner x.length(siendo la x el array que sea) para que lo recorra automaticamente
    for(int cont2=0;cont2<num.length;cont2++){

      Scanner s = new Scanner(System.in);
      System.out.print("pos: " + cont2 + "Introduce numero : ");	
      num[cont2] = Integer.parseInt(s.nextLine());
    }	

    System.out.print("Introduce posicion inicial : ");	
    Scanner s = new Scanner(System.in);
    posicioninicial = Integer.parseInt(s.nextLine());


    System.out.print("Introduce posicion final : ");	
    posicionfinal = Integer.parseInt(s.nextLine());


    System.out.print("array original: \t"); 

    for (int cont=0; cont<num.length; cont++){ 

      System.out.print(" " + cont + " ");

    }
        //copia del numero original para evitar los 0 en la salida y tener el contenido bien
     for (int cont=0; cont<num.length; cont++){ 
       
      aux[cont] = num[cont]; 
       
     }  
    
    System.out.print("\n");
    System.out.print("\t\t\t");


    for (int cont=0; cont<num.length; cont++){ 

      System.out.print(" " + num[cont] + " ");

    }



    aux[posicionfinal] = num[posicioninicial];

    
    int i=0;//incrementa las posiciones para introducir el numero
    int resultado = 9 - posicionfinal;//hacelas posiciones que se tiene que mover para guardar

    for (int cont=0; cont<num.length; cont++){ 

        if(i < resultado){
          aux[posicionfinal + 1 + i] = num[posicionfinal + i];
          i++;
        }
    }

    aux[0] = num[9];//intercambio de celda o posicion
    //operacion de ordenacion en el modificar array aux
    int j = 1;
    //boolean numerorepetido = false;
    for (int cont=0; cont<posicioninicial; cont++){ 
          aux[cont + 1] = num[cont];
    }

    // parte del modificado mostrar
    System.out.print("\narray modificado: \t"); 

    for (int cont=0; cont<aux.length; cont++){ 

      System.out.print(" " + cont + " ");

    }
    
    System.out.print("\n");
    System.out.print("\t\t\t");
    
    for (int cont=0; cont<aux.length; cont++){ 

      System.out.print(" " + aux[cont] + " ");

    }


  } // main  

}    

