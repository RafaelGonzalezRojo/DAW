public abstract class Animal {
	private Sexo sexo;
  public int energia;
  public String nombre;
	public Animal () {
		sexo = Sexo.MACHO;
	}
	public Animal (Sexo s) {
		sexo = s;
	}
  
  
	public Sexo getSexo() {
		return sexo;
	}
	public String toString() {
		return  "Sexo:" + this.sexo + "\n"
    + "soy de la clase:" + this.getClass().getName()+ "\n";
	}
	/**
	* Hace que el animal se eche a dormir.
	*/
	public void duerme() {
		System.out.println("Zzzzzzz");
	}
	
	public void come() {
		System.out.println("ñam ñam");
    energia = energia + 50;
	}
	
	public void domesticar() {
		System.out.println("nuestros lazos siempre estaran unidos");
    energia = energia + 100;
	}
  
  public int getEnergia(){

    return energia;
   }

  public void peleacon(Animal contrincante){
    
    System.out.println(this.getClass().getName());
    System.out.println("VS");
    System.out.println(contrincante.getClass().getName() + "\n");
    System.out.println("Energia de los contrincantes");
    System.out.println(this.getEnergia());
    System.out.println("VS");
    System.out.println(contrincante.getEnergia());
    
    int energiatotal=this.getEnergia();
    int energiatotal2=contrincante.getEnergia();
    
    int energia1=(int)(Math.random()*energiatotal);
    int energia2=(int)(Math.random()*energiatotal2);
    
     System.out.println(this.getClass().getName() +": " + energia1 + "  " + contrincante.getClass().getName() + ": " +energia2);
    
    if(energia1>energia2){
      
      System.out.println("el ganador es:" + this.getClass().getName());
    }else{
      
      System.out.println("el ganador es:" + contrincante.getClass().getName());
    }    
    
    
    
  }

}


