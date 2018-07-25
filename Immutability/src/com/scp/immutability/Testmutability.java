package com.scp.immutability;



class Address{
 private int pin;
 private String city;
public Address(int pin, String city) {
	super();
	this.pin = pin;
	this.city = city;
}
@Override
public String toString() {
	return "Address [pin=" + pin + ", city=" + city + "]";
}
public int getPin() {
	return pin;
}
public void setPin(int pin) {
	this.pin = pin;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}

}



final class Book{
final private int bid;
final private String bnm;
final private Address address;

public  Book(int b_id, String b_nm, Address address) {
	super();
	this.bid = b_id;
	this.bnm = b_nm;
	this.address=address;
	
}
@Override
public String toString() {
	return "Book [bid=" + bid + ", bnm=" + bnm + ",address=" +address+"]";
}
public int getBid() {
	return bid;
}
public String getBnm() {
	return bnm;
}
public Address getAddress() {
	//return address;
	return new Address(address.getPin(),address.getCity());
}



}


public class Testmutability {
public static void main(String[] args) {
	
	Address ad1=new Address(111,"pune");
	        ad1=new Address(111,"nashik");
	Book b1=new Book(101, "harryPotter",ad1);
	 b1=new Book(2, "HalfGirlfriend",ad1);
	ad1.setCity("mumbai");
	System.out.println(b1);
	
	
}

}

