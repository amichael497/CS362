import java.util.Scanner;

public class HotelMain {
	static String userType;
	
	public static void main(String[] args) {
		welcomeScreen();
	}
	
	public static void welcomeScreen() {
		loginScreen();
		if(userType == "guest") {
			handleGuest();
		} else if (userType == "employee") {
			handleEmployee();
		}
	}
	
	public static void loginScreen() {
		Scanner scanner = new Scanner(System.in);
		Boolean loginSuccessful = false;
		
		System.out.println("Welcome to the hotel management system");
		System.out.println("Sign in as a guest or employee.");
		
		
		while(!loginSuccessful) {
			System.out.println("Press 1 for guest or 2 for employee.");
			int choice = scanner.nextInt();
			if(choice == 1) {
				scanner.close();
				userType = "guest";
				return;
			} else if(choice == 2) {
				scanner.close();
				userType = "employee";
				return;
			} else {
				System.out.println("Input is not a user type.");
			}
		}	
		scanner.close();
	}
	
	public static void employeeMainScreen() {
		System.out.println("Menu:");
		System.out.println("1. Book Room");
		System.out.println("2. Check guest out of room");
	}
	
	public static void guestBookRoom() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter your full name:");
		scanner.nextLine();
		System.out.println("Please enter the room you would like to book");
		scanner.nextInt();
		System.out.println("Please enter the number of nights you would like to stay:");
		scanner.nextInt();
		System.out.println("Please enter the day you would like the room (mm/dd/yyyy)");
		
		scanner.close();
	}
	
	public static void handleGuest() {
		guestBookRoom();
		userType = "none";
		welcomeScreen();
	}
	
	public static void handleEmployee() {
		
	}

}
