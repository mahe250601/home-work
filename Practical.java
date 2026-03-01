import java.util.Scanner;
class practical
{
	public static void main(String[]args)
	{ 
	  Scanner sc=new Scanner(System.in);
	 
	/* int a=10;
	 System.out.println(a);
	 a=20;
	 System.out.println(a);
	 a=30;
	 System.out.println(a);*/
	 
	 
	 //datatype variable_name[]={};-literal
	int var[]={10,20,30,40};
	for(int i=0;i<var.length;i++)
	{
		System.out.println(var[i]);
		
	}
	
	// datatype var[]=new datatype[length]

	int varr[]=new int[8];
	for(int i=0;i<varr.length;i++)
	{
		varr[i]=sc.nextInt();
		
	}
	
	for(int i=0;i<varr.length;i++)
	{
		System.out.println(varr[i]);
		
	}
	
	
	


	
		
		
		
		
		
		
		
		
	}	
		
	
}