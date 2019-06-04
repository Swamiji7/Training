package com.lti.day3.inheritance.v3;


import java.time.LocalDateTime;

import com.lti.day3.inheritance.v1.LogLevel;

/**
 * A simple custom Logger implementation
 * @author Swamiji
 *@version 1.0
 *
 */
public abstract class Logger {
	/*
	  public class LogLevel{
	  		final String INFO;
	  		final String WARN;
	 		final String ERROR;
	 }
	 */
	//overloading log by using the same function name but with different number of arguments
	public void log(String msg) {
		System.out.println("[INFO] [ "+ LocalDateTime.now()+" ] "+msg);
			}
	public abstract void log(String msg,LogLevel level);
	}
	
	
	

