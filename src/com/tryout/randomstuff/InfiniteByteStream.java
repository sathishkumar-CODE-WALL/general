package com.tryout.randomstuff;

import java.util.Scanner;

public class InfiniteByteStream {
	
	
	public static void main(String args[]){
		int no=1;
		char b;
		Scanner scanner ;
		do{
			scanner =new Scanner(System.in);
			b=scanner.next().charAt(0);
			if(b=='0'){
				System.out.println("Entered 0");
				no=(no*2)+1;
			}else if(b=='1'){
				System.out.println("Entered 1");
				no=no*2;
			}
			System.out.println("decimal value"+ no);
			if(no%7==0)
				System.out.println("Divisilbe");
			else
				System.out.println("Not divisible");
		}while(b!='q');
		
		scanner.close();
	}

}
