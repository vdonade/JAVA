package com.thread;

public class ThreadDemo2 implements Runnable{

	public static void main(String[] args) {
		ThreadDemo2 t1 = new ThreadDemo2();
		
		Thread t = new Thread(t1);
		t.start();

	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"is running");
		
		
	}

}
