package com.scp.demo;

enum Beers{
	KingFisher,Budwiser,Tuborg,Beera;
}

public class TestEnum2 {
public static void main(String[] args) {
	Beers[] b=Beers.values();
	for(Beers b1:b){
		System.out.println(b1+""+b1.ordinal());
	}
}
}
