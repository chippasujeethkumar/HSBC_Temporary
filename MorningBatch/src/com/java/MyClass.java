package com.java;

  abstract class aclass{
	 // abstract methods
	 abstract void calculate(int x);
	 
 }

    class sub1 extends aclass
    {
		void calculate(int x) {
			System.out.println("square of number is " + (x*x));
			
		}
    	
    }
 
    class sub2 extends aclass
    {
		void calculate(int x) {
			// TODO Auto-generated method stub
			System.out.println("cube of number is " + (x*x*x));
				
		}
    	
    }
 
public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sub1 ob= new sub1();
		ob.calculate(5);
		
		sub2 ob1= new sub2();
		ob1.calculate(5);
		
		
	}

}
