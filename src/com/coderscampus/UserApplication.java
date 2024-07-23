package com.coderscampus;

import java.util.Scanner;

public class UserApplication {

	public static void main(String[] args) {
		String fileName = "data.txt";
		UserService2 userService = new UserService2(fileName);
		userService.readUsersFromDataFile(fileName);
		Scanner scanner = new Scanner(System.in); // pull up console to use keyboard
		int attempts = 0;
		boolean isLoggedIn = false; // starting login state. checks and updates during login process

		while (attempts < 5 && !isLoggedIn) { // loop login attempts less than 5 tries
			System.out.print("Enter your email: ");
			String username = scanner.nextLine().trim(); // trim removes whitespace
			System.out.print("Enter your password: ");
			String password = scanner.nextLine();

			User loggedInUser = userService.getUserByCredentials(username, password); // pull matched user
			if (loggedInUser != null) { // if user is found then update status to true
				isLoggedIn = true;
				System.out.println("Welcome, " + loggedInUser.getName()); // if true show matched name
			} else {
				attempts++;
				if (attempts < 5) {
					System.out.println("Invalid login, please try again.");
				} else {
					System.out.println("Too many failed login attempts, you are now locked out.");
				}

			}
		}

		scanner.close();
	}
}
