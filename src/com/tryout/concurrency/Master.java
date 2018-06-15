package com.tryout.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Master {
	
	static Master master = new Master();
	
	public static Master getInstance(){
		return master;
	}
	
	Log log = new Log();
	
	ExecutorService pool = Executors.newSingleThreadExecutor();
	
	public void process(){
		pool.execute(new Task());
	}
	
	
	public class Task implements Runnable{

		@Override
		public void run() {
			log.logMsg();
		}
		
	}
	
	public static void main(String ars[]){
		Master.getInstance().process();
	}

}


class Log{
	public void logMsg(){
		System.out.println("LOGGED");
	}
}