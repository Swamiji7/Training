package com.lti.day3.inheritance.v3;

public class LogFactory {
	
	public static Logger getLoggerInstance() {
		return new ConsoleLogger();
	}
}
