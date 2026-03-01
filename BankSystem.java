import java.util.Scanner;
class BankSystem 
{
     static double balance = 0;
    public static void deposit(double amount) 
	{
        if (amount > 0) 
		{
            balance += amount;
            System.out.println("Deposit successful!");
        } else 
		{
            System.out.println("Invalid deposit amount.");
        }
    }

    public static void withdraw(double amount) 
	{
        if (amount <= 0) 
		{
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) 
		{
            System.out.println("Insufficient balance.");
        } else 
		{
            balance -= amount;
            System.out.println("Withdrawal successful!");
        }
    }

    public static void displayBalance() 
	{
        System.out.println("Current Balance: Rs. " + balance);
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        int choice;
        double amount;

        do {
            System.out.println("\n===== Bank Menu =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) 
			{
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    amount = sc.nextDouble();
                    deposit(amount);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    amount = sc.nextDouble();
                    withdraw(amount);
                    break;

                case 3:
                    displayBalance();
                    break;

                case 4:
                    System.out.println("Thank you for using the Bank System.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4);

        
    }
}