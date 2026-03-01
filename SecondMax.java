import java.util.Scanner;
 class SecondMax 
 {
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        int n = 0;
        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Enter array elements");
            System.out.println("2. Find second maximum");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                    System.out.print("Enter number of elements: ");
                    n = sc.nextInt();

                    System.out.println("Enter elements:");
                    for (int i = 0; i < n; i++) {
                        arr[i] = sc.nextInt();
                    }

                    if (n < 2) 
					{
                        System.out.println("Need at least 2 elements!");
                        break;
                    }

                    int max = Integer.MIN_VALUE;
                    int secondMax = Integer.MIN_VALUE;

                    for (int i = 0; i < n; i++) 
					{
                        if (arr[i] > max) 
						{
                            secondMax = max;
                            max = arr[i];
                        } else if (arr[i] > secondMax && arr[i] != max) 
						{
                            secondMax = arr[i];
                        }
                    }

                    if (secondMax == Integer.MIN_VALUE)
                        System.out.println("No second maximum found.");
                    else
                        System.out.println("Second maximum = " + secondMax);

                    System.out.println("Exiting...");
                 
                    System.out.println("Invalid choice!");
            }

        } while (choice != 3);

        
    }
}
