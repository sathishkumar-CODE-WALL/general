package com.tryout.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService es = Executors.newSingleThreadExecutor();
		List<Runnable> listOfRunnables = new ArrayList<Runnable>();
		
		Runnable r1 = ()->System.out.println("Inside Runnable 1");
		listOfRunnables.add(r1);
		Runnable r2 = ()->System.out.println("Inside Runnable 2");
		listOfRunnables.add(r2);
		Runnable r3 = ()->System.out.println("Inside Runnable 3");
		listOfRunnables.add(r3);
		Runnable r4 = ()->System.out.println("Inside Runnable 4");
		listOfRunnables.add(r4);
		Runnable r5 = ()->System.out.println("Inside Runnable 5");
		listOfRunnables.add(r5);
		Runnable r6 = ()->System.out.println("Inside Runnable 6");
		listOfRunnables.add(r6);
		
		
		for(Runnable r : listOfRunnables)
			es.execute(r);
	}

}
