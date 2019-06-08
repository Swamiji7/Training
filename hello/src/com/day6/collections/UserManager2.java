package com.day6.collections;

import java.util.*;

public class UserManager2 {

	private Map<String, Integer> users;

	public UserManager2() {
		users = new HashMap<String, Integer>();
		users.put("majrul", 123);
		users.put("dinesh", 456);
	}

	public boolean isValidUser(String username, Integer password) {
		if (users.containsKey(username)) {
			Integer pwd = users.get(username);
			if (pwd.equals(password))
				return true;
		}
		System.out.println("User not matching the given criteria..");
		return false;

	}

	public static void main(String[] args) {
		UserManager2 mgr = new UserManager2();
		boolean isValid = mgr.isValidUser("majrul", 111);
	}

}
