package com.lti.day3.inheritance.v3;


import com.lti.day3.inheritance.v1.LogLevel;
import com.lti.day3.inheritance.v1.Logger;
public class App {
	public static void main(String[] args) {
		com.lti.day3.inheritance.v3.Logger l = LogFactory.getLoggerInstance();
		l.log("APP syed"+"\n");
		l.log("Some message",LogLevel.INFO);
		l.log("Again syed message",LogLevel.WARN);
		l.log("Some critical message",LogLevel.ERROR);
		 
	}
}
