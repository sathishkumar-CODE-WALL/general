package com.tryout.randomstuff;

/**
 * @author svenkatachalam
 * notes
 * JVM is just a spec
 * JRE is the implementation of JVM
 * JDK is a toolkit
 * bootstrap loader  ---> rt.jar and other classes
 * system class loader --->lib jars from classpath that is set
 * Class not found exception frrom  Class.forName("NonExistingClass")
 * NoClassDef exception is from when there is no definition for it.
 */
public class General {

	public General(int k){
		
	}
	
	class Inner{
		int k=8;
	}
	
	public static void main(String args[]){
		new General(4).test();
		General g = null;
		g.printhi();
		new TestThread().start();		
	}
	
	public void test(){
		System.out.println(new Inner().k);
	}
	
	static void printhi(){
		System.out.println("HI from static method");
	}
}

class TestThread extends Thread{
	
	public TestThread(){
		
	}
	
	void print(){
		System.out.println("Hi from Thread class");
	}
}
