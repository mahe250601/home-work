import java.util.Scanner;
class GradeSystem 
{ 
    static int mark1, mark2, mark3;
    static int total;
    static double percentage;

    static Scanner sc = new Scanner(System.in);

    static void inputMarks() {
        System.out.print("Enter Mark 1: ");
        mark1 = sc.nextInt();

        System.out.print("Enter Mark 2: ");
        mark2 = sc.nextInt();

        System.out.print("Enter Mark 3: ");
        mark3 = sc.nextInt();
    }

    static void calculateTotal() 
	{
        total = mark1 + mark2 + mark3;
        System.out.println("Total Marks = " + total);
    }

    static void calculatePercentage() 
	{
        percentage = total / 3.0;
        System.out.println("Percentage = " + percentage);
    }

    static void displayResult() 
	{
        if (percentage >= 40)
            System.out.println("Result: PASS");
        else
            System.out.println("Result: FAIL");
    }

    static void displayGrade() 
	{
        if (percentage >= 75)
            System.out.println("Grade: A");
        else if (percentage >= 60)
            System.out.println("Grade: B");
        else if (percentage >= 40)
            System.out.println("Grade: C");
        else
            System.out.println("Grade: F");
    }

    public static void main(String[] args) 
	{

        inputMarks();   

        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Display Total");
            System.out.println("2. Display Percentage");
            System.out.println("3. Display Result");
            System.out.println("4. Display Grade");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) 
			{
                case 1:
                    calculateTotal();
                    break;

                case 2:
                    calculateTotal();
                    calculatePercentage();
                    break;

                case 3:
                    calculateTotal();
                    calculatePercentage();
                    displayResult();
                    break;

                case 4:
                    calculateTotal();
                    calculatePercentage();
                    displayGrade();
                    break;

                case 5:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}