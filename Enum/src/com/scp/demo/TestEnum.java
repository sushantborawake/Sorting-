package com.scp.demo;

enum Beer{
	KingFisher,Budwiser,Tuborg,Beera;
}

public class TestEnum {

	public static void main(String[] args) {
		Beer b1=Beer.Budwiser;
switch(b1){
case KingFisher:System.out.println("its so strong");
break;
case Budwiser:System.out.println("it is a king of beer");
break;
case Tuborg:System.out.println("i dont like it");
break;
case Beera:System.out.println("its harshal's brand");
break;
default:System.out.println("must enter a valid Beer hahaha...");
}
	}

}
