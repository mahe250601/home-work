import java.util.Scanner;
class Music_class
{
	public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	int n;
	do
	{
	
	System.out.println("1.Deva");
	System.out.println("2.Spb");
	System.out.println("3.Suryavelan");
	System.out.println("4.stephen");
	System.out.println("enter your option");
	int opt=sc.nextInt();
	if(opt==1)
	{
		System.out.println("1.kuthu songs");
		System.out.println("2.breakup songs");
		System.out.println("3.love songs");
		System.out.println("4.item songs");
		System.out.println("enter your option");
		int op=sc.nextInt();
		if(op==1)
		{
		  System.out.println("pattu pada va");
		} 
		  else if(op==2)
		  {
			 System.out.println("usurey");
		  }
           else if(op==3) 
			{
				System.out.println("adi penne");
			}
			 else if (op==4)
			 {
				 System.out.println("kattipudi katti pudi da");
				 
			 }
				 
	}
		  else if (opt==2)
		  {
			  
		System.out.println("1.kuthu songs");
		System.out.println("2.breakup songs");
		System.out.println("3.love songs");
		System.out.println("4.item songs");
		System.out.println("enter your option");
		 int op=sc.nextInt();
		  
		  if (op==1)
		  {
			  System.out.println("adi rakku muthu raaku");
			  
		  }

		else if (op==2)
		{
			System.out.println("kadhaley ne pooverintgal");
		}

		   else if (op==3)
		   {
			   System.out.println("enavendru solvathama");
		   }

			  else if (op==4)
			  {
				  System.out.println("vadi vadi nattu kagttza");
			  }
			
		  }
		System.out.println("do you wanna continue 1");
		n=sc.nextInt();
		
	}while(n==1);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}