package com.lti.day3.inheritance.v3;

import java.time.LocalDateTime;

import com.lti.day3.inheritance.v1.LogLevel;

public class ConsoleLogger extends Logger {

	public void log(String msg, LogLevel level) {
		switch (level) {
		case INFO:
			System.out.println("[INFO] [" + LocalDateTime.now() + "]" + msg);
			break;
		case WARN:
			System.out.println("[WARNING][" + LocalDateTime.now() + "]" + msg);
			break;
		case ERROR:
			System.out.println("ERROR][" + LocalDateTime.now() + "]" + msg);
		}
	}
}