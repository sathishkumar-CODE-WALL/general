package com.tryout.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class RunnableCallable {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub

		ExecutorService executorService = Executors.newFixedThreadPool(4);
		
		Runnable r1 = ()->System.out.println("Inside Runnable execute");
		Runnable r2 = ()->System.out.println("Inside Runnable submit");
		Callable<String> r3 = ()->"Inside Callable submit";
		executorService.execute(r1);
		executorService.submit(r2);
		Future<String> f = executorService.submit(r3);
		System.out.println(f.get());
	}

}
