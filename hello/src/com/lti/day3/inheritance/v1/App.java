package com.lti.day3.inheritance.v1;

public class App {
	public static void main(String[] args) {
		Logger l = new Logger();
		l.log("APP started");
		l.log("Some message",LogLevel.INFO);
		l.log("Again some message",LogLevel.WARN);
		l.log("Some critical message",LogLevel.ERROR);
		 
	}
}
