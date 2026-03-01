import java.util.Scanner;

class Result
{
	Scanner sc = new Scanner(System.in); 
	int marks[] = new int[3];
	int total = 0 ;
	int percentage = 0 ;
	
	void inputMarks()
	{
		for(int i = 0;i < marks.length;i++)
		{
			System.out.print("Enter the "+ (i+1) +" mark : ");
			marks[i]=sc.nextInt();
		}
		
	}
	
	void calculateTotal()
	{
		for(int i = 0;i<marks.length;i++)
		{
			total+=marks[i];
		}
		System.out.println("Total Marks : "+ total);
	}
	
	void calculatePercentage()
	{
		int count = 0;
		for(int i = 0;i<marks.length;i++)
		{
			count++;
		}
		
		percentage = total / count;
		System.out.println("Total percentage : "+percentage);
	}
	
	void displayResult()
	{
		if (percentage >= 40)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
	
	void displayGrade()
	{
		if(percentage >= 75)
		{
			System.out.println("A Grade");	
		}
		else if(percentage >= 60 && percentage <=74)
		{
			System.out.println("B Grade");	
		}
		else if(percentage >= 40 && percentage <=59)
		{
			System.out.println("C Grade");	
		}
		else if(percentage < 40)
		{
			System.out.println("F Grade");	
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc1 = new Scanner(System.in);
		
		Result res = new Result();
		
		res.inputMarks();
		
		int choice = 0;
		
		
		while(choice != 5)
		{
			System.out.println("---- Result Calculation ----");
			System.out.println("1.Display Total");
			System.out.println("2.Display Percentage");
			System.out.println("3.Display Result");
			System.out.println("4.Display Grade");
			System.out.println("5.Exit");
			
			System.out.print("Enter Your Choice : ");
			choice = sc1.nextInt();
			
			switch(choice)
			{
				case 1:
				{
					res.calculateTotal();
					break;
				}
				
				case 2:
				{
					res.calculatePercentage();
					break;
				}
				
				case 3:
				{
					res.displayResult();
					break;
				}
				
				case 4:
				{
					res.displayGrade();
					break;
				}
				
				case 5:
				{
					System.out.println("Exiting...");
					break;			
				}
				
				default:
				{
					System.out.println("Invalid Choice.");
				}
							
			}
			
			
		}
	}
	
}