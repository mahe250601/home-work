import java.util.Scanner;
class DailyExpense 
{

    static double[] expenses = new double[100]; 
    static int count = 0; 

    
    public static void addExpense(Scanner sc) 
	{
        System.out.print("Enter expense amount: ");
        expenses[count] = sc.nextDouble();
        count++;
        System.out.println("Expense added successfully!\n");
    }

    
    public static void viewExpenses() 
	{
        if (count == 0) {
            System.out.println("No expenses recorded.\n");
            return;
        }
        System.out.println("Expenses:");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + expenses[i]);
        }
        System.out.println();
    }

    
    public static void totalExpense() 
	{
        double total = 0;
        for (int i = 0; i < count; i++) 
		{
            total += expenses[i];
        }
        System.out.println("Total Expense: " + total + "\n");
    }

   
    public static void highestExpense() 
	{
        if (count == 0) 
		{
            System.out.println("No expenses recorded.\n");
            return;
        }
        double max = expenses[0];
        for (int i = 1; i < count; i++) 
		{
            if (expenses[i] > max) 
			{
                max = expenses[i];
            }
        }
        System.out.println("Highest Expense: " + max + "\n");
    }

    
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("===== Daily Expense Tracker =====");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Total Expense");
            System.out.println("4. Highest Expense");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) 
			{
                case 1:
                    addExpense(sc);
                    break;
                case 2:
                    viewExpenses();
                    break;
                case 3:
                    totalExpense();
                    break;
                case 4:
                    highestExpense();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice!\n");
            }

        } while (choice != 5);

        
    }
}