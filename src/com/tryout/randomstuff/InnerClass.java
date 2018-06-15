package com.tryout.randomstuff;

public class InnerClass {
	
	int id;
	boolean flag=true;
		
	class Inner {
		
		public Inner(){
			id=9;
			flag=false;
		}
		
		public void executeInner(){
			if(flag==false){
				System.out.println("Inside Inner class");
				System.out.println(id);
			}
		}
	}
	
	InnerClass(){
		new Inner().executeInner();
	}
	
	public static void main(String args[]){
		new InnerClass();
	}
	

}
