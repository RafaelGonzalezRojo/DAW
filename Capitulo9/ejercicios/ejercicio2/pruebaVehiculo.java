
import java.util.Scanner;
public class pruebaVehiculo {
	public static void main(String[] args) {
			
		int opcion = 0;	
			
		  Bicicleta bmx= new Bicicleta("acrobacia");
		  Bicicleta bicipaseo= new Bicicleta("paseo");
		  Coche deportivo = new Coche("opel");
		  Coche sabbat = new Coche("luis");
		  //demostracion
	/**  System.out.println("/////DEMOSTRACION/////");
		  deportivo.quemarueda();
		  bmx.caballito();
		  bmx.recorre(20);
		  bmx.recorre(20);
		  bicipaseo.recorre(30);
		  deportivo.recorre(100);
		  sabbat.recorre(200);
		  System.out.println("kilometros de la bici: " + bmx.getmodelo() + " a recorrido " + bmx.getKilometraje() + " km");
		  System.out.println("kilometros de la bici: " + bicipaseo.getmodelo() + " a recorrido " + bicipaseo.getKilometraje() + " km");
		  System.out.println("kilometros del coche: " + deportivo.getmodelo() + " a recorrido " + deportivo.getKilometraje() + " km");
		  System.out.println("kilometros del coche: " + sabbat.getmodelo() + " a recorrido " + sabbat.getKilometraje() + " km");
		  System.out.println("kilometrosTotales: " + Vehiculo.getKilometrajeTotal() + " km");	
		   System.out.println("Vehiculos Creados: " + Vehiculo.getvehiculosCreados());	
		   System.out.println("/////FIN DEMOSTRACION/////"); **/
   
 do{  
		
		System.out.println("/////PROGRAMA/////");
		System.out.println("1. Anda con la bicicleta ");
		System.out.println("2. Haz el caballito con la bicicleta");
		System.out.println("3. Anda con el coche");
		System.out.println("4. Quema rueda con el coche");
		System.out.println("5. Ver kilometraje de la bicicleta");
		System.out.println("6. Ver kilometraje del coche");
		System.out.println("7. Ver kilometraje total");
		System.out.println("8. Salir");
		System.out.println("Elige una opción (1-8):");
		Scanner s = new Scanner(System.in);
		opcion = Integer.parseInt(s.nextLine());
	
	
		switch (opcion) {
			case 1:
			
			System.out.print("inserte numero de kilometros para la bicicleta: ");
			int numkilometros = Integer.parseInt(s.nextLine());
			bmx.recorre(numkilometros);
			break;
			
			case 2:
			bmx.caballito();
			
			break;
			
			case 3:
			System.out.print("inserte numero de kilometros para el coche: ");
			numkilometros = Integer.parseInt(s.nextLine());
			deportivo.recorre(numkilometros);
			break;
			
			case 4:
			
			deportivo.quemarueda();
			break;
			
			
			case 5:
			 System.out.println("kilometros de la bici: " + bmx.getmodelo() + " a recorrido " + bmx.getKilometraje() + " km");
			
			break;
			
			case 6:
			 System.out.println("kilometros del coche: " + deportivo.getmodelo() + " a recorrido " + deportivo.getKilometraje() + " km");
			
			break;
			
			case 7:
			System.out.println("kilometrosTotales: " + Vehiculo.getKilometrajeTotal() + " km");
			break;
			
		}

		
  
	}while(opcion!=8);
	
	 System.out.println("/////SALIENDO DEL PROGRAMA/////");
	
 }
}  


