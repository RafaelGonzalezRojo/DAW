public class PruebaAnimal {
public static void main(String[] args) {

	Gato garfield = new Gato(Sexo.MACHO, "romano","lisa");
	Gato cheto = new Gato(Sexo.MACHO, "negro");
	Mamifero lisa = new Mamifero(Sexo.HEMBRA,"juana");
	Gato kuki = new Gato();
	Mamifero ayo = new Mamifero(Sexo.MACHO);
	Mamifero robin = new Mamifero();
  Perro pluto = new Perro();
  Lagarto guancho =new Lagarto();
  Canario pio = new Canario();
  Pinguino pingu = new Pinguino(Sexo.MACHO);
  
	System.out.println(garfield);//hay que tener en cuenta los valores que se pasa segun el constrructor que hay
	System.out.println(cheto);
	System.out.println(lisa);//la madre esta predefinida en mamifero en casso de que la clase gato no la tenga pilla por defecto la del mamifero
	System.out.println(kuki);
	System.out.println(ayo);
  System.out.println(robin);
  System.out.println(pluto);
  System.out.println(guancho);
  System.out.println(pio);
  System.out.println(pingu);
  
  pingu.peleacon(kuki);
  pingu.vuela();
  pio.vuela();
  
	ayo.amamantar();//clase mamifero superior a gato
	kuki.amamantar();//clase mas baja gato puede utilizar tb amamantar
	kuki.parto();//la clase gato puede utilizar metodos de superclase en este caso mamifero.
	
	}
}
