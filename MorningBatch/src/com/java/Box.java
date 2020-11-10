package com.java;


 class Box1{
	double width;
	double height;
	double depth;
	
}




public class Box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//classname obj = new classname()
		
		Box1 ob1= new Box1();
		ob1.depth=100;
		ob1.height=300;
		ob1.width=200;
		
		System.out.println("volume of the box 1 is " +  (ob1.depth *ob1.height *ob1.width)      );
		
		Box1 ob2= new Box1();
		ob2.depth=150;
		ob2.height=350;
		ob2.width=250;
		System.out.println("volume of the box 2 is " +  (ob2.depth *ob2.height *ob2.width)      );
		

	}

}
