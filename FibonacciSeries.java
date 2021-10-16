import java.util.Scanner;

public class FibonacciSeries
{
	public static void main(String[] args)
	{
		int first_number = 0, second_number = 1, next_number;
		
		System.out.println("Enter the number you want to find fibonacci series");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
	
		//loop starts from 2 because 0 and 1 are already printed    
	
		for(int i=1; i <= number; ++i)
		{    
			next_number=first_number+second_number;    
			System.out.println(" " +next_number);
		
			first_number = second_number;    
			second_number = next_number;    
		}
		
	}

}
