/**Realiza un programa que diga si un número entero positivo introducido por teclado es
capicúa. Se permiten números de hasta 5 cifras.*/


package matematicas;
//esto va arriba al principio
import java.util.Scanner;



public class De1a14{
	
	public static boolean esCapicua(int x) {

    int num = x;		
   /** while(num > 0){

      volteado = volteado*10 + num%10;
      num /= 10; 

    } **/ 
    if(num == Volteado(num)){ //aplica la funcion Volteado para dar vuelta y comprobar su igualdad para ver si es capicual
      return true;
    }else{
      return false;
    } 
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


//si es primo o no

  public static boolean esPrimo(int n) {
   
    boolean primo = true;
    
    for (int i = 2; i < n; i++) {
      if ((n % i) == 0) {
        primo = false;
      }
    }
    
    if (primo) {
      return true;
    } else {
      return false;
    }
  }
  
//el primo siguiente

  public static int esPrimoSiguiente(int n) {
    boolean bandera = true;   
    boolean esPrimo = true; 
    int maximo=Integer.MAX_VALUE;
    for(int y=0; y <= maximo; y++){  
      esPrimo = true; 
      for (int i = 2; i < y; i++) {
        if ((y % i) == 0) {
          esPrimo = false;
        }
      }

      if ((esPrimo)&&(bandera)) {

        if(y>n && bandera == true){
          bandera = false;
          return y;
          
        }  
      }else if(bandera == true) {

      }
    }
    return 0; //devolver 0 en caso de que no tenga  valor o no entre en el return y poner lo que devuelve al final en este caso el 0
     
  }
  
  //potencia funcion devuelve un entero con su respectivo resultado
  
  public static int Potencia(int n,int e) {
    int potencia=1;
    int resultado=0;
    for(int y=0; y < e ; y++){  
       
      potencia= potencia * n;
     
    }
    return potencia;
  }
  
  public static int Digitos(int n) {
     
    int num = n;		
    int cont = 0;
    while(num > 0){
      
      num /= 10;
      cont++; 
    }
     
    return cont; 
     
  }  //digitos funcion  que cuenta digitos
  
  public static int Quitadetras(int n,int c) {
    int resultado=0;
    resultado =n / Potencia(10 ,c);
    return resultado;
      
  }//quita por detras es una funcion que quita numero determinado de cifras a un numero por la derecha se apoya con la funcion potencia que hace que al dividir eleva 10 por una undad seguida de ceros

  public static int Quitadelante(int n,int c) {
    int resultado=0;
     //volteo el numero para quitarle por delante
    resultado =Volteado(n) / Potencia(10 ,c);
    return Volteado(resultado);
    //y vuelvo a voltearlo para enviar el numero al derecho
      
  }

//funcion que te selecciona el numero por la posicion dada
  public static int PosicionDeDigito(int num,int b) {

      int n = Volteado(num); //volteo el numero para hacerlo de izquierda a derecha
      int resultado=0;
      int cont=0;
      int posicion=0;
      boolean bandera = true;
  
     
    while(n > 0){
        resultado = n%10;
        if(resultado == b){ // verifica si es el numero buscado, si es asi guarda la posicion y cambia el estado de la bandera
          bandera = false;
          n = 0;
          posicion = cont;
        } else{
          cont++;
        }
        n /= 10; 
      }//fin de while
      
      if(!bandera){
       return posicion; 
      }else{
       return -1; 
      }    
        
  }
  
  public static int DigitoN(int num,int b) {
      //b es igual a la posicion demandada por el usuario y con el if devuelve el digito
      int n = Volteado(num); //volteo el numero para hacerlo de izquierda a derecha
      int resultado=0;
      int cont=0;
      int posicionnum=0;//almacena numero en la posicion deseada por el ususario;
      boolean encontrado = false;
      boolean mayorpos = false;
		
   
	  if(Digitos(n) < b){//comprueba el nuemero de digitos para si el usuario se ekiboka poder controlarlo con el boleano
		mayorpos = true;
		}
       while(cont <= b){
		 if(mayorpos){
			posicionnum = -1; //se inicializa a menos -1 para escapar del bucle
			b=-1; //se inicializa a menos uno para que no de mas vueltas bucle y no sea 0 la salida y escapar de el
		}	      
        resultado = n%10;
        if(cont == b){
         posicionnum = resultado;
         encontrado= true;
       }
        n= n/10;
        cont++;
      }//fin de while
      
      
      
      if(encontrado){
       return posicionnum; 
      }else if(mayorpos){
       return -1; 
      }
      return -1; //salida por defecto dado que return solo metidos en el if no lo permite 
  }    
    
    //pon por detras
    
    public static int PonDetras(int num,int b) {
		int numero = num;
		int cifras = Digitos(b);//cuento cuantas cifras tiene el numero a pegar obtengo un entero ej 3
		int unidadseguidadeceros = Potencia(10,cifras);//este numero solo tengo elevarlo como exponente a la base de 10 como cifras 3 el resultado seria 1000
		int resultado = (num * unidadseguidadeceros) +b;//por ultimo el unidad seguida de ceros se le multiplica al numero obteniendo ej 34 * 1000 = 34000 a esto se le suma el numero propuesto en este caso variable b
		return resultado; 
			
		
	}
    
 
	 public static int PonDelante(int num,int b) { //es lo mimo pero se cuenta los digitos del numero ya que ahora se debe multiplicar por el numero propuesto b y sumar luego el numero establecido num
		int numero = num;
		int cifras = Digitos(numero);
		int unidadseguidadeceros = Potencia(10,cifras);
		int resultado = (b * unidadseguidadeceros) + numero; 
		return resultado;
	}	
    
		public static int TrozoNumero(int num,int inicial, int finalnum) {
		 int ini = inicial;
		 int numero=num;
		 int fin=finalnum;
		 int quitafinalreal=0;
		 
		 quitafinalreal = Digitos(numero) - fin;//se calcula para el final de posicion para que no kite el numero de digitos de la posicion sino hasta la posicion
		 System.out.print("quita real: " + quitafinalreal);
		 numero = Quitadelante(numero,ini+1); //el mas 1 es porke la posicion 0 la cuente
		 numero = Quitadetras(numero,quitafinalreal);
		 return numero;
		 
		
		}
    
        public static int JuntaNumeros(int num,int b) {
		int numero = num;
		int cifras = Digitos(b);//cuento cuantas cifras tiene el numero a pegar obtengo un entero ej 3
		int unidadseguidadeceros = Potencia(10,cifras);//este numero solo tengo elevarlo como exponente a la base de 10 como cifras 3 el resultado seria 1000
		int resultado = (num * unidadseguidadeceros) +b;//por ultimo el unidad seguida de ceros se le multiplica al numero obteniendo ej 34 * 1000 = 34000 a esto se le suma el numero propuesto en este caso variable b
		return resultado; 
			
		
		}
    
    

}//FIN DE MAIN
