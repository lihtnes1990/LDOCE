package com.modules;

import java.io.IOException;

import org.apache.commons.exec.ExecuteException;


public class Appium_Config {
	public static Process p;
	public static void startAppium() throws ExecuteException, IOException, InterruptedException{
		p = Runtime.getRuntime().exec("\"C:/Program Files (x86)/Appium/node.exe\" \"C:/Program Files (x86)/Appium/node_modules/appium/bin/appium.js\" --no-reset --local-timezone");
		Thread.sleep(10000);
		if (p != null) {
			System.out.println("Appium server Is started now."); 
			} 
	}

	public static void stopAppium(){
		if (p != null) {
			p.destroy();
			} 
		System.out.println("Appium server Is stopped now.");
	}
}
