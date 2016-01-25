package mx.edu.utng.asociaciones;

import java.util.ArrayList;
import java.util.List;

public class AdressBook {
	private String name;
	private List<Contact> contacts;
	private List<ContactGroup> contactGroup;
	
	
	
	public AdressBook(){
		this.contacts=new ArrayList<Contact>();
		this.contactGroup=new  ArrayList<ContactGroup>();
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name=name;
		
	}

	
}
