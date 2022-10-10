import java.util.*;
public class Main {
    public static void main(String[] args) 
    {
	Scanner sc= new Scanner(System.in);
	while (true)
	{
        	System.out.println("Make a chioce from the following:");
		System.out.println("1: add two integers");
		System.out.println("2: multiply two integers");
		System.out.println("3: exit");
		int choice= sc.nextInt();  
		if (choice==1)
		{
			System.out.println("Enter first integer:");
			int n1= sc.nextInt(); 
			System.out.println("Enter second integer:");
			int n2= sc.nextInt();
			int result=n1+n2;
			System.out.println("The result is "+result);
			
		}
		else
		if (choice==2)
		{
			System.out.println("Enter first integer:");
			int n1= sc.nextInt(); 
			System.out.println("Enter second integer:");
			int n2= sc.nextInt();
			int result=n1*n2;
			System.out.println("The result is "+result);
		}
		else
		if (choice==3)
		{
			System.out.println("exit");
			break;
		}
		else
		{
			System.out.println("invalid choice, try again");
		}

		
	}
    }
}
