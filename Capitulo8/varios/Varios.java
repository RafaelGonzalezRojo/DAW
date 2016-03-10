
package varios;
//esto va arriba al principio
import java.util.Scanner;
import static java.lang.Math.pow;
//Muestra los números primos que hay entre 1 y 1000.

public class Varios{
 
 
 public static int Primos(int star,int limit){
    boolean primo = true;
  
   do{	
	primo = true;  
    for (int i = 2; i < star; i++) {
      if ((star % i) == 0) {
        primo = false;
      }
    }
    
    if (primo) {
	System.out.print(" " + star + " \n");
     return star; 
    } else {
       primo = false;
    }
    star++;
	}while(star<limit);
	return 0;
  }
 
  public static int Capicua(int star,int limit){
	
			
    while(star<=limit){
		if(star == Volteado(star)){ //aplica la funcion Volteado para dar vuelta y comprobar su igualdad para ver si es capicual
		  System.out.print("\t " + star + " ");
		} 
		star++;
	}
	return 0;
 }
		


//pasa a binario

 public static double binario(int numero){

		int exp=0;
        double binario=0;
        int digito=0;
        while(numero!=0){
                digito = numero % 2;            
                binario = binario + digito * Math.pow(10, exp); //incremeta el exponente en cada pasada para poder obtener su binario  
                exp++;
                numero = numero/2;
        }
        
        return binario;
   }
 //pasa a decimal  
  public static int numdecimal(int numerobinario){
	  int cont = 1;
	  int auxdecimal=0;
	  int numdecimal=0;
	   while(numerobinario>0){
		   
		 auxdecimal = numerobinario % 2;//se obtiene el resto
		 numdecimal = numdecimal + auxdecimal*cont;//se va pasado a decimal
		 numerobinario = numerobinario / 10;//se va quitando los digitos
		 cont=cont*2;//se incrementa el contador
	   
		
		}
	  
	  
	  return numdecimal;
	  
	}
	//pasa a hexadecimal
	 public static String hexadecimal(int numero){
	
	String hexadecimal=""; 
	int rem=0;
	
     // Digits in hexadecimal number system
     char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
 
     while(numero>0){
       rem=numero%16; 
       hexadecimal=hex[rem]+hexadecimal; 
       numero=numero/16;
     }
	
		return hexadecimal;
	}
	
	
	//pasa a octal
	
	public static double octal(int numero){

		int exp=0;
        double octal=0;
        int digito=0;
        while(numero!=0){
                digito = numero % 8;            
                octal = octal + digito * Math.pow(10, exp); //incremeta el exponente en cada pasada para poder obtener su binario  
                exp++;
                numero = numero/8;
        }
        
        return octal;
   }
	
	
   //voltea un numero
  public static int Volteado(int x) {  
  x=Math.abs(x);      
  int num = x;		
  int volteado = 0;
  while(num > 0){

    volteado = volteado*10 + num%10;
    num /= 10; 
  }  

  return volteado;


  } 
   
   
}//fin del main   





        
