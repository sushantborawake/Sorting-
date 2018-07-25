package com.scp.demo;

enum Wines{
	SheninBlence(500),Madira(400),SulaRe(300),Portwine;
	int price;
	Wines(int price){
		this.price=price;
	}
	Wines(){
		this.price=200;
	}
	public int getprice(){
		return price;
	}
}

public class TestEnum4 {

	public static void main(String[] args) {
        Wines[] w=Wines.values();
        for(Wines w1:w){
        	System.out.println(w1+""+w1.getprice());
        }
	}

}
