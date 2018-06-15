package com.tryout.randomstuff;

import java.math.BigInteger;

public class BigIntegerParsing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isRampLogicPassed("1234567809","10"));
		System.out.println(isRampLogicPassed("1234567811","10"));
		System.out.println(isRampLogicPassed("1234567826","25"));
		System.out.println(isRampLogicPassed("1234567824","25"));
		System.out.println(isRampLogicPassed("1234567890","12"));
		System.out.println(isRampLogicPassed("1234567890","12"));
		System.out.println(isRampLogicPassed("1234567890","12"));
		System.out.println(isRampLogicPassed("1234567890","12"));
		System.out.println(isRampLogicPassed("1234567890","12"));
		System.out.println(isRampLogicPassed("123423423432234567809","12"));
		
	}
	
	 public static boolean isRampLogicPassed(String accountNo, String rampPercentage){
	    	if(accountNo==null || accountNo.isEmpty())
	    		return false;
	    	if(rampPercentage==null || rampPercentage.isEmpty())
	    		return false;
	    	
	    	BigInteger accNo = new BigInteger(accountNo);
	    	Long lastTwoDigits = (accNo.mod(new BigInteger("100"))).longValue();
	    	
	    	if(lastTwoDigits < Long.valueOf(rampPercentage))
				return true;
	    	return false;
	    }

}
