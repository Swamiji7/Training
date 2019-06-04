package com.lti.day3.inheritance.v2;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

import com.lti.day3.inheritance.v1.LogLevel;

public class FileLogger extends Logger {
	public void log(String msg, LogLevel level) {
		try (FileWriter f = new FileWriter("app.log",true)){
			switch(level) {
			case INFO:
				f.write("[INFO] ["+ LocalDateTime.now()+"]"+msg+"\n");
			    break;
			case WARN:
				f.write("[WARNING]["+ LocalDateTime.now()+"]"+msg+"\n");
				break;
			case ERROR:
				f.write("ERROR]["+LocalDateTime.now()+"]"+msg+"\n\n");	
			}
		
		}
		catch(IOException e) {
			e.printStackTrace();
			
		}
	}
}