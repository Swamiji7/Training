package com.lti.day4.interfaces;

public class Main {
	public static void main(String[] args) {
		Launcher l=new Launcher();
		MobileApplication app=new App();
				
		l.launch(app);
		l.launch(app);
		
		int count=l.taskManager.runningApps();
		System.out.println("No of apps running : "+count);
		app.version();
}
}

