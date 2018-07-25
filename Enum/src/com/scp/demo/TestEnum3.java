package com.scp.demo;

enum Wisky{
	ib,md,bp;
	Wisky(){
		System.out.println("inside enum constructor");
	}
}
public class TestEnum3 {
public static void main(String[] args) {
	Wisky w=Wisky.bp;
	System.out.println("hello");
}
}
