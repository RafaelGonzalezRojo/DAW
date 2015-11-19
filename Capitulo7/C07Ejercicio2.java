/**Define un array de 10 caracteres con nombre simbolo y asigna valores a los elementos
según la tabla que se muestra a continuación. Muestra el contenido de todos los elementos
del array. ¿Qué sucede con los valores de los elementos que no han sido inicializados?*/

public class C07Ejercicio2{
public static void main(String[] args) {
char[] num; // se define num como un array de enteros
num = new char[10]; // se reserva espacio para 12 enteros
num[0]='a';
num[1]='x';
num[4]='@';
num[6]=' ';
num[7]='+';
num[8]='Q';
							//en vede 9 se puede poner x.length(siendo la x el array que sea) para que lo recorra automaticamente
		for(int cont=0;cont<num.length;cont++){
				
				System.out.print("pos" + cont + ": " + num[cont] + "\n");
			
		}	


	}
}
