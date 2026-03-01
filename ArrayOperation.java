import java.util.Scanner;

class ArrayOperation
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Array Length : ");
		int len = sc.nextInt();
			
		int num[] = new int[len];
			
		for(int i = 0 ; i < num.length ; i++)
		{
			System.out.print("Enter the " + i + " Index Value : ");
			num[i] = sc.nextInt();
		}
		
		int choice = 0;
		
		while(choice != 7)
		{
			System.out.println("---- MENU ----");
			System.out.println("Maximum Number -> 1");
			System.out.println("Minimum Number -> 2");
			System.out.println("Second Maximum Number -> 3");
			System.out.println("Second Minimum Number -> 4");
			System.out.println("Reverse Number -> 5");
			System.out.println("Average Number -> 6");
			System.out.println("Exit -> 7");
			
			System.out.print("Enter the Choice : ");
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
				{
					int max = 0;
					for(int i = 0 ; i < num.length ; i++)
					{
						if(num[i] > max)
						{
							max = num[i];
						}
					}
					System.out.println("Maximum Number is : " + max);
					break;
				}
				
				case 2:
				{
					int min = num[0];
					for(int i = 0 ; i < num.length ; i++)
					{
						if(num[i] < min)
						{
							min = num[i];
						}
					}
					System.out.println("Minimum Number is : " + min);
					break;
				}
				
				case 3:
				{
					int max = 0;
					for(int i = 0 ; i < num.length ; i++)
					{
						if(num[i] > max)
							{
								max = num[i];
							}
						}
					 			 
					int max2 = num[0];
					 
					for(int i = 0 ; i < num.length ; i++)
					{
						if(num[i] > max2 && num[i] < max)
						{
							max2 = num[i];
						}
					}
					System.out.println("Second Maximum Number is : " + max2);
					break;
				}
				 
				case 4:
				{
					int min = num[0];
					for(int i = 0 ; i < num.length ; i++)
					{
						if(num[i] < min)
						{
							min = num[i];
						}
					}
					
					
					int min2 = num[0];
					
					for (int i = 0; i<num.length;i++)
					{
						if(num[i] < min2 && num[i] > min)
						{
							min2 = num[i];
						}
					}
					System.out.println("Second Minimum Number is : " + min2);
					break;
				}
				
				case 5:
				{
					for(int i =0 ;i<num.length/2;i++)
					{
						int temp =num[i];
						int last = num.length-1-i;
						num[i]=num[last];
						num[last]=temp;	
					}
					
					for(int i=0;i<num.length;i++)
					{
						System.out.print(num[i] + " ");
					}
					break;
				}
				
				case 6:
				{
					int sum = 0;
					for(int i =0 ;i<num.length;i++)
					{
						sum+=num[i];
					}
					int count=0;
					for(int i=0;i<num.length;i++)
					{
						count++;
					}
					int ave=sum/count;
					System.out.println("Average Number : "+ ave);
					break;
				}
				
				case 7:
				{
					System.out.println("Exiting....");
					break;
				}
				
				default:
				{
					System.out.println("Invalid Choice");
				}				
			}	
		}				
	}
}