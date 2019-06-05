package com.lti.day4.interfaces;
/**
 * Contract for a Mobile Application
 * @author Syed
 * 
  */
public interface MobileApplication {
	
	public void start();
	public void pause();
	public void stop();
	
	String INFO="Developed by Syed";
	public default void version() {
		System.out.println(INFO+" Version 1.0");
	}
}



