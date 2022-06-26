import java.util.Scanner;
public class LargestNumber
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		int i = 0;
		int hinum = 0;
		int number;
		
		while(i <= 10)
		{
			
			System.out.print("Enter a number :");
		    number = in.nextInt();
			
			if(hinum < number)
			{
				hinum = number;
			}
			i++;
		}

	System.out.println("The largest number is " + hinum);
	}
}