import java.util.Scanner;
 class ReverseArray
 {
    public static void main(String[] args) 
	{

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        int n = 0;
        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Enter array");
            System.out.println("2. Reverse array");
            System.out.println("3. Display array");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch(choice) 
			{

                case 1:
                    System.out.print("Enter number of elements: ");
                    n = sc.nextInt();

                    System.out.println("Enter elements:");
                    for(int i = 0; i < n; i++) 
					{
                        arr[i] = sc.nextInt();
                    }
                    break;

                case 2:
                    int start = 0, end = n - 1;

                    while(start < end) {
                        int temp = arr[start];
                        arr[start] = arr[end];
                        arr[end] = temp;

                        start++;
                        end--;
                    }

                    System.out.println("Array reversed successfully!");
                    break;

                case 3:
                    System.out.println("Array elements:");
                    for(int i = 0; i < n; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while(choice != 4);

        
    }
}
