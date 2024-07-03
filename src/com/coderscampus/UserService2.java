package com.coderscampus;

public class UserService2 {
	public UserService2(String string) {
		
	}

	public User createUser(String[] stringInput) {
		if (stringInput == null || stringInput.length != 3) {
		}

		String username = stringInput[0];
		String password = stringInput[1];
		String name = stringInput[2];

		return new User();
	}

	public User createUser(String username, String password, String name) {
		return new User();
	}

	public User[] createUsers(String[][] userDetailsArray) {
		User[] users = new User[userDetailsArray.length];
		for (int i = 0; i < userDetailsArray.length; i++) {
			String[] userDetails = userDetailsArray[i];
			String username = userDetails[0];
			String password = userDetails[1];
			String name = userDetails[2];
			users[i] = createUser(username, password, name);
		}
		return users;
	}

}
