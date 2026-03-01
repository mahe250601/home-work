import java.util.Scanner;
class MaximumPractice
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int sum = 0;

        
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) 
		{
            arr[i] = sc.nextInt();
            sum += arr[i]; 
        }

        
        int max = arr[0];
        for (int i = 1; i < n; i++) 
		{
            if (arr[i] > max) 
			{
                max = arr[i];
            }
        }

        
        System.out.println("Maximum element = " + max);
        System.out.println("Sum of elements = " + sum);

        
    }
}
