package com.java;

public class fisrtpgm {

	static int a; 
	
	int b;

	public static void main(String[] args) {

		//classname objectname = new classname();
		
		fisrtpgm obj = new fisrtpgm();
		
		obj.mul();
		obj.b=20;

		
	}

	static void sum() {
		
	}

	void mul() {
		
		System.out.println("im in non static method");
	}

}
