import java.util.Scanner;
class ExamScoreAnalyzer 
{

    static int[] scores = new int[100]; 
    static int count = 0; 

    
    public static void addScore(Scanner sc) 
	{
        System.out.print("Enter exam score: ");
        scores[count] = sc.nextInt();
        count++;
        System.out.println("Score added successfully!\n");
    }

    
    public static void displayScores() 
	{
        if (count == 0) 
		{
            System.out.println("No scores available.\n");
            return;
        }
        System.out.println("Exam Scores:");
        for (int i = 0; i < count; i++) 
		{
            System.out.println((i + 1) + ". " + scores[i]);
        }
        System.out.println();
    }

    
    public static void countPass() 
	{
        int passCount = 0;
        for (int i = 0; i < count; i++) 
		{
            if (scores[i] >= 40) 
			{
                passCount++;
            }
        }
        System.out.println("Number of Pass Scores: " + passCount + "\n");
    }

    
    public static void countFail() 
	{
        int failCount = 0;
        for (int i = 0; i < count; i++) 
		{
            if (scores[i] < 40) 
			{
                failCount++;
            }
        }
        System.out.println("Number of Fail Scores: " + failCount + "\n");
    }

    
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("===== Exam Score Analyzer =====");
            System.out.println("1. Add Exam Score");
            System.out.println("2. Display All Scores");
            System.out.println("3. Count Pass Scores");
            System.out.println("4. Count Fail Scores");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) 
			{
                case 1:
                    addScore(sc);
                    break;
                case 2:
                    displayScores();
                    break;
                case 3:
                    countPass();
                    break;
                case 4:
                    countFail();
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