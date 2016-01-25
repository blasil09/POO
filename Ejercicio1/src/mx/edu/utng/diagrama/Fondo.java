package mx.edu.utng.diagrama;

public class Fondo {
	private String fondo;
	private TarjetaAnimada tarjetaAnimada;
	
	public Fondo(TarjetaAnimada tarjetaAnimada) {
		this.tarjetaAnimada=tarjetaAnimada;
		// TODO Auto-generated constructor stub
	}
	
	public String getTexto(){
		return fondo;
	
	}
	
   public void setFondo(String fondo){
	   this.fondo=fondo;
   }

}
