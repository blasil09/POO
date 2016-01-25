package mx.edu.utng.diagrama;


import java.util.ArrayList;
import java.util.List;

public class TarjetaAnimada extends Tarjeta  {
	
	private String codigo;
	private ArchivoDeTarjetas archivoDeTarjetas;
	/*private Dedicatoria dedicatoria;
	private Imagen imagen;
	*/
	
	public TarjetaAnimada (ArchivodeTarjetas archivoDeTarjetas) {
		this.archivoDeTarjetas=archivoDeTarjetas;
		//this.imagen=imagen;
		//this.dedicatoria= new Dedicatoria();
		
		// TODO Auto-generated constructor stub
	}
	
	
	public String getCodigo(){
		return codigo;
	}
	
	public void SetCodigo(String codigo){
		this.codigo=codigo;	
	}
	
}
