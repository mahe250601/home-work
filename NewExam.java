import java.util.Scanner;
class NewExam 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter " + n + " integer elements:");
        for (int i = 0; i < n; i++) 
		{
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements without duplicates:");

        for (int i = 0; i < n; i++) 
		{
            boolean Duplicate = false;

            for (int j = 0; j < i; j++) 
			{
                if (arr[i] == arr[j]) 
				{
                    Duplicate = true;
                    break;
                }
            }

            if (!Duplicate) 
			{
                System.out.print(arr[i] + " ");
            }
        }

        
    }
}