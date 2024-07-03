package com.coderscampus;

import java.util.Scanner;

public class UserApplication {

	public static void main(String[] args) {
		UserService2 userService = new UserService2("data.txt");
		Scanner scanner = new Scanner(System.in);

		
		String[][] userDetailsArray = {
				{ "test@email.com", "passwordTest!1", "Test User" },
				{ "another@user.com", "asdfasdf", "Another User" },
				{ "john.doe@mydomain.net", "Hdk398jf!", "John Doe" },
				{ "jane.doe@myotherdomain.com", "sunrise-sunset", "Jane Doe" } };

		
		User[] users = userService.createUsers(userDetailsArray);

		
		int attempts = 0;
		final int MaxAttempts = 4;

		
		while (attempts < MaxAttempts) {
			
			System.out.print("Enter email: ");
			String username = scanner.nextLine();
			System.out.print("Enter password: ");
			String password = scanner.nextLine();

			
			if (users != null) {
				System.out.println("Welcome: " + users);
				break;
			} else {
				attempts++;
				if (attempts >= MaxAttempts) {
					System.out.println("Too many failed login attempts, you are now locked out.");
				} else {
					System.out.println("Invalid login, please try again.");
				}

			}

		}

		scanner.close();
	}
}
