package com.tryout.randomstuff;

public class AnonymousClass {
	
	// inner class
	// Anonymous inner class
	// static inner class
	//inner class inside method
	
	public AnonymousClass(){
		// anonymous inner class
		Travel t = new Travel(){

			@Override
			public int getSpeed(int speed, String desc) {
				// TODO Auto-generated method stub
				return speed;
			}
		};
		t.getSpeed(100, "testMsg");
		
		Travel lambdaTravel = (speed,desc)-> speed+100;
		lambdaTravel.getSpeed(100, "lambda");
		
		Travel lambdaTravel2 = (speed,desc)-> { return speed+100;};
		lambdaTravel2.getSpeed(200, "test");
	}
}

@FunctionalInterface
interface Travel{
	public int getSpeed(int speed, String desc);
}
