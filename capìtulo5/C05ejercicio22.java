/**Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.**/



public class C05ejercicio22 {
	
	public static void main(String[] args) {
		
		
				int bandera = 1;
				int contador2 = 2;
															
																			
				while(contador2 <= 100){													
						
									bandera = 1;
									for (int i = 2; i < contador2; i++){
													
														
														if (contador2 % i == 0) {
																	bandera = 0;
														}
										}// pasa las comparaciones de todos los numeros
														if (bandera == 1){
																System.out.println(" " + contador2 + " ");
														}
										
														contador2++;
									
				}															
			
	}
			
}			
							
						
