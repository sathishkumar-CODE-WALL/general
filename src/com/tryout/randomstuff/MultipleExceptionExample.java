package com.tryout.randomstuff;

public class MultipleExceptionExample{    
    public static void main(String args[]){    
        try{    
            int array[] = new int[10];    
            array[10] = 30/0;    
        }    
        catch(ArithmeticException | ArrayIndexOutOfBoundsException e){ 
        //catch(Exception | ArithmeticException | ArrayIndexOutOfBoundsException e){  incorrect - 
        	//if we are using specialized then dont use generalized exception
            System.out.println(e.getMessage());  
        }    
     }    
} 