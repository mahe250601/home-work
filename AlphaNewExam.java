import java.util.scanner;
class AlphaNewExam
{
	public static void main(String[] args)
	{
		scanner sc = new scanner(system.in);
		
		system.out.print("array elements")
		int a = sc.nextint();
		
		int arr[]= new int[a];
		
		system.out.println("enter " + a + " integer");
		for (int i=0; i<a;i++)
		{
			arr[i] = sc.nextint();
		}
	}            system.out.println("array elements without duplicate");
	       
		   for(int i=0; i<a; i++)
			   boolean is duplicate = false
		   
		   
		   for(int j=0;j<i;j++)
		   {
			   if (arr[i] == arr[j])
			   {
				   isduplicate = true;
				   break;
				   
				   
			   }
			   
			   if (!isduplicate)
			   {
				   system.out.print(arr[i] + "  ");
			   }
		   }
}