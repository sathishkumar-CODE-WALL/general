package com.tryout.randomstuff;

import java.util.Scanner;

public class DecimalToBinary {

	private static void convertDecimalToBinary(int number) {
        int[] binary = new int[50];
        int i = 0;

        while (number > 0) {
            binary[i++] = number % 2; // to get remainder, either 1 or 0.
            number = number / 2; // we need to get factors till get 1.
        }
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(binary[j]);
        }
    }

    public static void main(String[] args) {
        //convertDecimalToBinary(8);
        for(int index=1, input=2;index<11;index++){
        	//System.out.println(index<<1);
        	System.out.println(Integer.toBinaryString(index));
        }
        
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        char[] charArray = input.toCharArray();
        for(int index=1;index<(2^input.length());index++){
        	
        }
        
        
    }
    
}
