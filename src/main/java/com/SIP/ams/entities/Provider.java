package com.SIP.ams.entities;

public class Provider {
  @Override
	public String toString() {
		return "Provider [name=" + name + ", adress=" + adress + ", email=" + email + "]";
	}
private String name;
  private String adress;
  public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Provider(String name, String adress, String email) {
	super();
	this.name = name;
	this.adress = adress; 
	this.email = email;
}
public Provider() {
	super();
	
}
public String getAdress() {
	return adress;
}
public void setAdress(String adress) {
	this.adress = adress;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
private String email;
}