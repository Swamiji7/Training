package com.day6.collections;

import java.util.*;

public class UserManager {

	private List<User> users;

	public UserManager() {
		users = new ArrayList<User>();
		users.add(new User("majrul", "123", false));
		users.add(new User("dinesh", "456", true));
	}

	public boolean isValidUser(String username, String password) {
		for (User user : users)
			if (user.getUsername().equals(username) && user.getPassword().equals(password) && user.isActive())
			{	
				System.out.println("Matching User..");
				return true;
			}
		System.out.println("User not matching the given criteria..");
		   return false;

	}

	public static void main(String[] args) {
		UserManager mgr = new UserManager();
		boolean isValid = mgr.isValidUser("majrul", "111");
	}

}
