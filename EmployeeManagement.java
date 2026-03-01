import java.util.Scanner;

class EmployeeManagement 
{
	
	Scanner sc1 = new Scanner(System.in);
	
	int count = 0;
	
	void addEmployeeId(int[] empIds)
	{
		if (count < empIds.length)
		{
			System.out.print("Enter the Employee ID : ");
			empIds[count]=sc1.nextInt();
			count++;
			System.out.println("Employee ID Added.");
		}
		else
		{
			System.out.println("Employee List is Full");
		}
	}
	
	void removeEmployeeId(int[] empIds )
	{
		System.out.print("Enter employee ID to be remove : ");
        int removeId = sc1.nextInt();
		boolean found = false;
					
		for(int i = 0;i<count;i++)
		{
			if(removeId == empIds[i])
			{
				for(int j =i;j<count-1;j++)
				{
					empIds[j]=empIds[j+1];
				}			
				found = true;
				System.out.println("Employee ID removed.");
			}				
		}
		if(!found)
		{
			System.out.println("Employee ID Not Found.");
		}
		count--;				
	}
	
	void displayEmployeeId(int[] empIds)
	{
		if (count == 0) 
		{
            System.out.println("No employee IDs to display.");
        } 
		else 
		{
            System.out.println("Employee IDs:");
            for (int i = 0; i < count; i++) 
			{
                System.out.print(empIds[i] + " ");
            }
            System.out.println();
        }				
	}
	

    public static void main(String[] args) 
	{

        Scanner sc = new Scanner(System.in);
		
		EmployeeManagement em = new EmployeeManagement();
		
        int empIds[] = new int[100];  
		
		int choice = 0;
			
		while(choice != 4)
		{
			System.out.println("***** Menu *****");
            System.out.println("1. Add employee ID");
            System.out.println("2. Remove employee ID");
            System.out.println("3. Display employee IDs");
            System.out.println("4. Exit");

            System.out.print("Enter your choice : ");
            choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
				{
					em.addEmployeeId(empIds);
					break;
				}
				
				case 2:
				{
					em.removeEmployeeId(empIds);
					break;
				}
				
				case 3:
				{
					em.displayEmployeeId(empIds);
                    break;
				}
					
                case 4:
				{
                    System.out.println("Exiting...");
                    break;
				}

                default:
				{
                    System.out.println("Invalid choice.");
				}
			}
		}		
		
	}
}
	