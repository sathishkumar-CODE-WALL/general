package com.tryout.randomstuff;

import java.util.Optional;

/**
 * Null checks are not required.
No more NullPointerException at run-time.
We can develop clean and neat APIs.
No more Boiler plate code

 * @author svenkatachalam
 *
 */
public class OptionalTest {
	
	public static void main(String args[]){
		String testMsg=null;
		Optional<String> optStr = Optional.of("hello");
		if(optStr.isPresent()){
			//do logic here
		}
		//if Present
		optStr.ifPresent(s->System.out.println("inside if present logic"));
		
		String s = Optional.ofNullable(testMsg).orElse("default");
		
	}

}
