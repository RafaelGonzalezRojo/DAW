import java.util.Scanner;
public class pruebaZona {
	public static void main(String[] args) {
			
		int opcion = 0;	
		int subopcion = 0;	
		Zona ZonaPrincipal = new Zona(1000);
		Zona ZonaCompraVenta = new Zona(200);
		Zona ZonaVip = new Zona(25);
		
	
   
 do{  
		
		System.out.println("/////PROGRAMA/////");
		System.out.println("1. Mostrar número de entradas libres ");
		System.out.println("2. Vender Entradas");
		System.out.println("3. Salir");
		System.out.println("Elige una opción (1-3):");
		Scanner s = new Scanner(System.in);
		opcion = Integer.parseInt(s.nextLine());
	
	
		switch (opcion) {
			case 1:
			
			System.out.print("Entradas Principal: " + ZonaPrincipal.getEntradasPorVender() + "\n");
			System.out.print("Entradas Compra y Venta: " + ZonaCompraVenta.getEntradasPorVender() + "\n");
			System.out.print("Entradas Vip: " + ZonaVip.getEntradasPorVender() + "\n");
			break;
			
			case 2:
				System.out.println("1. Zona Principal ");
				System.out.println("2. Zona Compra y Venta");
				System.out.println("3. ZonaVip");
				Scanner y = new Scanner(System.in);
				subopcion = Integer.parseInt(y.nextLine());
				switch (subopcion) {
							case 1:
							System.out.println("Cuantas Entradas Desea?");
							Scanner v = new Scanner(System.in);
							int entradas = Integer.parseInt(v.nextLine());
							ZonaPrincipal.vender(entradas);
							
							break;
					
							case 2:
							System.out.println("Cuantas Entradas Desea?");
							Scanner v2= new Scanner(System.in);
							entradas = Integer.parseInt(v2.nextLine());
							ZonaCompraVenta.vender(entradas);
							break;
							
							case 3:
							System.out.println("Cuantas Entradas Desea?");
							Scanner v3= new Scanner(System.in);
							entradas = Integer.parseInt(v3.nextLine());
							ZonaVip.vender(entradas);
							break;
				}	
			
			break;
			
	
			
		
			
		}

		
  
	}while(opcion!=3);
	
	 System.out.println("/////SALIENDO DEL PROGRAMA/////");
	
 }
}  
