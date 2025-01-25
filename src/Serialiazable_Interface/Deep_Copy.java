package Serialiazable_Interface;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Address implements Serializable
{
	private String address;
	private int postalCode;
	
	public Address(String address, int postalCode) {
		super();
		this.address = address;
		this.postalCode = postalCode;
	}
	
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	
	public String toString()
	{
		return "Address :"+getAddress()+"Postalcode :"+getPostalCode();
	}
	
	
}


class Person implements Serializable
{
	
	private String name;
	private Address address;
	
	public Person(String name, Address address)
	{
		this.name=name;
		this.address=address;		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	public Person deepCopy()
	{
	
		try
		{
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		
		ObjectOutputStream  oos = new ObjectOutputStream(bos);
		
		oos.writeObject(this);
			
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		
		ObjectInputStream ois = new ObjectInputStream(bis);
		
		return (Person)ois.readObject();
		
	
		
		}
		catch(Exception  e)
		{
			e.printStackTrace();
			return null;
		}
		
	}
	
	
	
	
}
public class Deep_Copy 
{
public static void main(String[] args) {
	
}
	
}
