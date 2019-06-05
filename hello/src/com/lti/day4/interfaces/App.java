package com.lti.day4.interfaces;

public class App implements MobileApplication{

	@Override
	public void start() {
		System.out.println("My application is running..\n");
		
	}

	@Override
	public void pause() {
		System.out.println("My application has paused..\n");
		
	}

	@Override
	public void stop() {
		System.out.println("My application has stopped..\n");
		
	}

}
