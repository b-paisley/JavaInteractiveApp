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
		System.out.println("3: sub two integers");
		System.out.println("4: power of two integers");
		System.out.println("5: exit");
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
		if (choice==3)
		{
			System.out.println("Enter first integer:");
			int n1= sc.nextInt();
			System.out.println("Enter second integer:");
			int n2= sc.nextInt();
			int result=n1-n2;
			System.out.println("The result is "+result);

		}
		else
		if (choice==4)
		{
			System.out.println("Enter first integer:");
			int n1= sc.nextInt();
			System.out.println("Enter second integer:");
			int n2= sc.nextInt();
			int result = n1;
			for(int i = 0; i < n2; i++){
				result*=n1;
			}
			System.out.println("The result is "+result);
		}
		else
		if (choice==5)
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
