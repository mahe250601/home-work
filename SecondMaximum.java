import java.util.Scanner;
 class SecondMaximum 
 {
    public static void main(String[] args) 
	{

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) 
		{
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++) 
		{

            if(arr[i] > max) 
			{
                secondMax = max;
                max = arr[i];
            }
            else if(arr[i] > secondMax && arr[i] != max) 
			{
                secondMax = arr[i];
            }
        }

        if(secondMax == Integer.MIN_VALUE)
            System.out.println("Second maximum not found");
        else
            System.out.println("Second maximum = " + secondMax);

        sc.close();
    }
}
