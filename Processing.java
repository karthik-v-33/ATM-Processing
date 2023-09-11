package ATM_DemoProject;

public class Processing extends Welcome {

	public void Process() {
		System.out.println("Press 1 for Savings Account");
		System.out.println("Press 2 for Current Account");
		while (true) {
			int acc = scanner.nextInt();
			if (acc == 1 || acc == 2) {
				break;
			} else
				System.out.println("Enter vaild number based on you account");
		}
		System.out.println("Welcome to processing section");
		while (true) {
			System.out.println("Press 1 Cash Withdrawal");
			System.out.println("Press 2 Cash Deposit");
			System.out.println("Press 3 Main Balance");
			System.out.println("Press 4 Loan Process");
			System.out.println("Press 5 Exit");
			int press = scanner.nextInt();
			int pre = press;
			switch (pre) {
			case 1: {
				System.out.println("Enter amount to Withdraw from you account");
				while (true) {
					int withdrawal = scanner.nextInt();
					if (withdrawal <= balance) {
						balance = balance - withdrawal;
						System.out.println("Your current Balance : Rs. " + balance);
						break;
					} else {
						System.out.println("Insufficient cash balance Please enter vaild amount");
						System.out.println("Your current balance is Rs. " + balance);
					}
				}
				break;
			}
			case 2: {
				System.out.println("Enter amount to Deposit");
				int deposit = scanner.nextInt();
				balance = deposit + balance;
				System.out.println("Your current Balance : Rs. " + balance);
				break;
			}
			case 3: {
				System.out.println("Your current Balance : Rs. " + balance);
				break;
			}
			case 4: {
				int eligible = balance * 3;
				System.out.println("Enter your required Loan Amount");
				while (true) {
					int loan = scanner.nextInt();
					if (loan <= eligible) {
						balance = balance + loan;
						System.out.println("Your current Balance : Rs. " + balance);
						break;
					} else
						System.out.println(
								"Your not Eligible for this amount" + "\n" + "Please enter Eligible Loan Amount");
					System.out.println("Your Maximum Eligible Amount is Rs. " + eligible);
				}
				break;
			}
			case 5: {
				System.out.println("Thank You");
				break;
			}
			default:
				System.out.println("Enter vaild number");
			}
			if (press == 5) {
				break;
			}
		}
	}
}
