package com.tryout.randomstuff;

public class PassByReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point pt1= new Point();
		Point pt2 = new Point();
		
		System.out.println("x:" +pt1.x+ "y:"+pt1.y);
		System.out.println("x:" +pt2.x+ "y:"+pt2.y);
		swap(pt1,pt2);
		System.out.println("x:" +pt1.x+ "y:"+pt1.y);
		System.out.println("x:" +pt2.x+ "y:"+pt2.y);
	}
	
	static void swap(Point arg1, Point arg2){
		arg1.x=10;
		arg1.y=10;
		Point temp = arg1;
		arg2=arg1;
		arg1=temp;
	}

}

class Point{
	public int x=0;
	public int y=0;
	
}
