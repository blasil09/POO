package mx.edu.utng.diagrama;

public class Imagen {
   private String nombre;
   private TarjetaAnimada tarjetaAnimada;
   
   public Imagen(TarjetaAnimada tarjetaAnimada) {
		this.tarjetaAnimada=tarjetaAnimada;
		// TODO Auto-generated constructor stub
	}
   
   public String getNombre(){
		return nombre;
	
	}
	
  public void setNombre(String nombre){
	   this.nombre=nombre;
  }
   
  
}
