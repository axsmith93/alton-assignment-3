package com.coderscampus;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class UserService2 {

	public User[] users; // Stores user objects
	public int numUsers; //keep track of the number of users

	public UserService2(String filename) {
		this.users = new User[4]; // array holds 4 users PUT THIS IS USER CLASS
		this.numUsers = 4; // set counter to 0
		// readUsersFromDataFile("data.txt");
		 initializeUsers();
	}
	 private void initializeUsers() {
	users[0] = new User("test@email.com", "passwordTest!1", "Test User");
    users[1] = new User("another@user.com", "asdfasdf", "Another User");
    users[2] = new User("john.doe@mydomain.net", "Hdk398jf!", "John Doe");
    users[3] = new User("jane.doe@myotherdomain.com", "sunrise-sunset", "Jane Doe");
    
}
    
	public void readUsersFromDataFile(String filename) {
		
		try (BufferedReader fileReader = new BufferedReader(new FileReader("data.txt"))) {
			String line = ""; // line variable stores line of text from file
			 while ((line = fileReader.readLine()) != null) {
			String[] parts = line.split(","); // checks line separated with "," usern. passw. name
		    
				users[numUsers] = new User(parts[0], parts[1], parts[2]); // represents U.P.N
				numUsers++;
			
			}
		System.out.println(Arrays.toString(users));
		} catch (IOException e) { // handles exceptions. ex: file not found/ red error
		}
	}
	


	// public=use outside of method. user=return type return a user object. gUBC
	// name of method.
	public User getUserByCredentials(String username, String password) {
		for (int i = 0; i < numUsers; i++) { //process each user in the array one by one
			User currentUser = users[i]; // get user object in users array and assign to currentUser
			if (currentUser.getUsername().equalsIgnoreCase(username) && currentUser.getPassword().equals(password)) {
				// ^^ if statement checks if user and passw. match what is entered
				return currentUser;
			}
		}
		return null; // no matching user found
	
	}
}