package com.java;

class Box2 {
	double width;
	double height;
	double depth;

	void setDimentions(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
		
		  System.out.println("voulue of box is "+ (w*h*d));
	}


	
	
}

public class SetBox {

	public static void main(String[] args) {

		Box2 ob1= new Box2();
		ob1.setDimentions(100, 200, 300);
		
		
		
	}

}
