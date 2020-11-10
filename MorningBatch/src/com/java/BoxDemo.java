package com.java;

class Box5 {
	double width;
	double height;
	double depth;

// Diff between constructor and method 
//-- constructor name should be same as class name
//- Constructor never have retrun type	

	Box5(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;

	}

	double vol()
	{
	return (width*height*depth);
	
	}

}

public class BoxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Box5 mybox= new Box5(10,20,30);
		System.out.println(mybox.vol()); 
		Box5 mybox2= new Box5(100,200,300);
		System.out.println(mybox2.vol()); 


		//string functions
		
		String s="selenium";
		String a="automation";
		
		s.
		
		
		
	}

}
