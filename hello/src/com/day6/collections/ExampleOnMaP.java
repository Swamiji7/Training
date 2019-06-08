package com.day6.collections;

import java.util.HashMap;
import java.util.Map;

public class ExampleOnMaP {

	public static void main(String[] args) {
		Map<String, String> map1= new HashMap<String, String>();
		map1.put("4642.54215.65","majrul");
		map1.put("2642.54215.65","swami");
		map1.put("3342.54215.65","syed");
		
		String user =map1.get("3342.54215.65");
		System.out.println(user);
	}
}
