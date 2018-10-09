import java.util.Scanner;

public class conditionalStatements {

	public static void main(String[] args) {

		String userName;
		Scanner scan = new Scanner(System.in);
		char userResponse = 'Y';

		// Prompt user to input name 
		System.out.println("Hi! What's your name?");
		
		// Accept response
		userName = scan.nextLine();
		System.out.println();

		System.out.println("Thanks " + userName + "!");

		do {
			System.out.println("Please enter an integer between 1 and 100: ");
			int userInput = scan.nextInt();
			System.out.println();
			
			// validates that entry is between 1 and 100 exclusive
			if (userInput > 1 && userInput < 100) { 
				System.out.println("Thanks for entering " + userInput + " " + userName + ".");
				System.out.println();
				
				// determines whether number is even
				if (userInput % 2 == 0) {
					System.out.print("This number is even");
					
					// validates that number is between 2 and 25 inclusive
					if (userInput >= 2 && userInput <= 25) {
						System.out.println(" and less than 25.");
						System.out.println();
					} else {
						System.out.println(".");

					}
				} else {
					System.out.println();
					System.out.print("This number is Odd");
					
					// validates that the odd response is over 60
					if (userInput > 60) {
						System.out.println(" and over 60.");
					} else {
						System.out.println(".");
					}
				}
				
				// Accept user response 
				System.out.println("Press Y if you'd like to continue: ");
				userResponse = scan.next().charAt(0);

				System.out.println();

			} else {
				
				// if validation fails because a number outside of the 2 - 99 range inclusive, user sees this message
				System.out.println("Only values between 1 and 100 will be accepted.");
				
				// user is given the option to continue program
				System.out.println("Press Y if you'd like to continue: ");
				userResponse = scan.next().charAt(0);
				System.out.println();
				System.out.println();

			}

		} 
		// accepts affirmative user response regardless of case
		while (userResponse == 'y' || userResponse == 'Y');
		
		// officially ends program
		System.out.println("Goodbye.");
		scan.close();

	}

}
