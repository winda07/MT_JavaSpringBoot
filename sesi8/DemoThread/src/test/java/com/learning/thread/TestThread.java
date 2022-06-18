package com.learning.thread;

import org.junit.Test;

public class TestThread {
	
	@Test
	public void ThreadHelloTest() {
		System.out.println();
		for(int i=0; i<5; i++) {
			ThreadHello instance = new ThreadHello(String.valueOf(i));
			Thread t = new Thread(instance);
			t.start();
		}
	}
	
	@Test
	public void ThreadWorldTest() {
		// TODO Auto-generated method stub
		System.out.println();
		for(int i=0; i<5;i++) {
			ThreadWorld instance = new ThreadWorld();
			instance.setName(""+i);
			instance.start();
		}
	}
	
	@Test
	public void ThreadNumberTest() {
		System.out.println();
		// TODO Auto-generated method stub
		NumberGeneration generation = new NumberGeneration(1000,2000);
		for(int i=0; i<3; i++) {
			new ThreadNumber(generation).start();
		}
	}
}