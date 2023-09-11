package ATM_DemoProject;

import java.util.Scanner;

public class Welcome {
	public int balance = 25000;
	Scanner scanner = new Scanner(System.in);
	public void display() {
		System.out.println("Welcome to ATM machine");
		System.out.println("Insert your ATM card And Enter your PIN number");
		int pin = 1234;
		while (true) {
			int password = scanner.nextInt();
			if (pin == password)
				break;
			else
				System.out.println("Please enter vaild PIN number");
		}
	}
	
}
