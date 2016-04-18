public class Ave extends Animal{
	
  
	public Ave(Sexo s) {
		super(s);
	}
	
	
  public Ave(){
		super();
    
	}
 
  
	public String toString() {
		return super.toString();
	}
	/**
	* Hace que el animal amantar.
	*/
	public void vuela() {
		System.out.println("estoy volando");
	}
	
	public void anidar() {
		System.out.println("cogiendo ramitas para el nido");
	}
	
	public void ponerhuevo() {
		System.out.println("ploof pedazo de huevo");
	}
	
}
