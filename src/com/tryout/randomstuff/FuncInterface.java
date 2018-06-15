package com.tryout.randomstuff;


public class FuncInterface {

	static TestInterface t = x->x%2==0?true:false;
	
	public static void main(String args[]){
		System.out.println(t.calculate(5));
		internalCal(t->t%3==0?true:false);
		Child achild = new Child();
		achild.test();
	}
	
	static void internalCal(TestInterface t){
		System.out.println(t.calculate(8));
	}
}
//functional interfaces are interfaces with just only one abstract method.
@FunctionalInterface
interface TestInterface{
	public boolean calculate(int x);
	public default void print(){
		System.out.println("i m in default");
	}
}

//Predicate for true or false .. will have test method
//consumer for accept  .. will have accept method no return type
//supplier for get ... will have get method with T as retun type
//function apply .. will take and return a T

interface A {
	   default void test(){
	      System.out.println("Inside A method.");
	    }
}

interface B {
	   default void test(){
	      System.out.println("Inside B method.");
	    }
}

class Child implements A,B{
	public void test(){
		B.super.test();
	}
}
