package mx.edu.utng.diagrama;

public class Dedicatoria {
	private String texto;
	
	private TarjetaAnimada tarjetaAnimada;
	   
	   public Dedicatoria(TarjetaAnimada tarjetaAnimada) {
			this.tarjetaAnimada=tarjetaAnimada;
			// TODO Auto-generated constructor stub
		}
	   
	
	public String getTexto(){
		return texto;
	
	}
	
   public void setTexto(String texto){
	   this.texto=texto;
   }

}
