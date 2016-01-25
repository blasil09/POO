package mx.edu.utng.asociaciones;

import java.util.List;

public class Account {
private String name;
private String emailAdress;
private List<AdressBook> isAccessBy;

public Account (List<AdrressBook> isAccessBy){
	this.isAccessBy=isAccessBy;
}

public String getName(){
	return name;
}

public String getEmailAdress(){
	return emailAdress;
	
}

public void setName(String name){
	this.name=name;
	
}

public void setEmailAdress(String emailAdress){
	this.emailAdress=emailAdress;
	
}
}
