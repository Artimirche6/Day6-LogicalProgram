import java.util.Scanner;
import java.time.Duration;
import java.time.Instant;

public class StopWatch
{
	public static void main(String[] args)
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter to start");
		scan.nextLine();
		Instant start = Instant.now();
		
		System.out.println("enter key to stop");
		scan.nextLine();
		Instant finish = Instant.now();
		
		long timeElapsed = Duration.between(start, finish).toMillis();
		
		System.out.println("Elapsed Time between Start and End : " +timeElapsed+ " ms");
		
	}

}
