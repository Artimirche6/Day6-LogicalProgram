import java.util.Scanner;

public class ReverseNumber
{
	public static void main(String[] args)
	{
		int number, reverse = 0;  
    	
    	System.out.println("Enter the number to be reverse");
    	Scanner scan = new Scanner(System.in);
    	number = scan.nextInt();
    	
		int temp = number;
		
    	while(number!= 0)   
    	{  
			int remainder = number % 10;  
			reverse = reverse * 10 + remainder;  
			number = number / 10;  
    	} 
    	
    	System.out.println("The Reverse of the Number " +temp+ " is : " + reverse);  
		
	}

}
