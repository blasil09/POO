package mx.edu.utng.diagrama;

import java.lang.reflect.Array;
import java.util.List;

import mx.edu.utng.asociaciones.ContactGroup;

public class Tarjeta {
	private String tipo; 
	private String dedicatoria; 
	private Remitente remitente; 
	private Integer nroDestinatarios; 
	private List<Destinatario> destinatarios; 
	
	 
	public Tarjeta(List<Destinatario> destinatarios, Remitente remitente){ 
	this.destinatarios = destinatarios; 
	this.remitente = remitente; 
	} 
	public List<Destinatario> destinatarios() { 
		return destinatarios; 
		} 

	 
	public void setDestinatarios(List<Destinatario> destinatarios) { 
	 		this.destinatarios = destinatarios; 
	 	} 

	
	public String getTipo(){
		return tipo;
	
	}
	
   public void setTipo(String tipo){
	   this.tipo=tipo;
   }
  
  public int getNroDestinatarios(){
		return nroDestinatarios;
	
	}
	
 public void setNroDestinatarios(int nroDestinatarios){
	   this.nroDestinatarios=nroDestinatarios;
	   
 }
 


}
