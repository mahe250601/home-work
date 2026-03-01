import java.util.Scanner;

class q1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
				
		System.out.print("Enter the length : ");
		int len = sc.nextInt();
		
		int arr[] = new int[len];		
		
		for(int i = 0;i<arr.length;i++)
		{
			System.out.print("Enter the value of "+ i + " index : ");
			arr[i]= sc.nextInt();
		}
		
		for(int i = 0;i<arr.length;i++)
		{
			boolean duplicate = false;
			
			for(int j = 0;j < i;j++)
			{
				if(arr[j] == arr[i])
				{
					duplicate = true;
					break;
				}
				
			}
			if(!duplicate)
				{
					System.out.println(arr[i] + " ");
				}
		}
		
	}
}