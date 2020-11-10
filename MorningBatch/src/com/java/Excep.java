package com.java;

public class Excep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int a = 100;
		int b = 10;

		try {
			int c = a / b;
			
			System.out.println(c);
		} catch (Exception e) {
			System.out.println("Please dont give second number as zero");
		}
		
		finally {
			  System.out.println("i am in finally");
		}
	}

}
