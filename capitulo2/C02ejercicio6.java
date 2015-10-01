/**Escribe un programa que calcule el total de una factura a partir de la base imponible (precio
sin IVA). La base imponible estará almacenada en una variable.*/


public class C02ejercicio6 {
public static void main(String[] args) {

double factura = 100;
double iva = 21;
double resultado = 0;

resultado =  factura + ( factura * iva ) / 100;

System.out.print("el resultado de la factura en euros es: " + resultado +" euros");


	}
}
