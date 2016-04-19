/**
* 2.Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
* ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de esos
* números. El tamaño de la lista también será aleatorio y podrá oscilar entre 10
* y 20 elementos ambos inclusive.**/


import java.util.ArrayList;

public class ejercicio2 {
  public static void main(String[] args) {
  
    ArrayList<Integer> a = new ArrayList<Integer>();
              
    int tamano = ((int)(Math.random()* 11) + 10);
    int suma = 0;
    int maximo = Integer.MIN_VALUE;
    int minimo = Integer.MAX_VALUE;
    int media = 0; 
           
        for (int i = 0 ; i < tamano ; i++ ){    
            a.add((int)(Math.random()*101));//genera los numeros aleatorios y directamente los mete en el arraylist
        }

        // Muestra el array
        System.out.print ("Array: ");
          for (int i : a) {
            System.out.print ( i + " ");
          }

          for (int i : a){
              suma = suma + i;
          }
     
          System.out.println("\nSuma Total: " + suma);

          // Media
          media = suma / a.size(); //el size sacara cuantos elementos hay en el Arraylist

          System.out.println("Media: " + media);

          // Maximo

          for (int i : a){
              if (i > maximo) {
                  maximo = i;
              }
          }

          System.out.println("El numero maximo es: " + maximo);

          // Minimo

          for (int i : a) {
              if (i < minimo) {
                  minimo = i;
              }
          }

          System.out.println("El numero minimo es: " + minimo);
  }
}
