package com.lti.day4.interfaces;
/**
 * 
 * Inbuilt Launcher
 * for launching mobile apps
 * @author vshadmin
 * 
 */

public class Launcher {
	
	public static TaskManager taskManager=new TaskManager(); 
	
	public void launch(MobileApplication mobileApp) {
		mobileApp.start();
		taskManager.inform(mobileApp);
		}
	
	public void closeAllRunningApps() {
		taskManager.clearAll();
	}
	
}


