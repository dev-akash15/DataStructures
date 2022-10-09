package recursion;
import java.util.Scanner;

public class FactorialOfNumber{

	public static void main(String[] s)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		System.out.println(fact(n));
	}

	public static int fact(int n)
	{
		if(n==1) return n;
		return n* fact(n-1);
	}
}