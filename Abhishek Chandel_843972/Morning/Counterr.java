package com.org;

public class Counterr implements Runnable {
	@Override
	public synchronized void run() {
		for(int i=1;i<=100;i++) {
			System.out.println("Counter :"+i);
		}
	}

}
