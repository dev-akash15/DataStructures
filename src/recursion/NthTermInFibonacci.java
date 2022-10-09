package recursion;

import java.util.Scanner;
public class NthTermInFibonacci{
	
	public static void main(String[] s){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Nth term");
		int n = sc.nextInt();
		System.out.println(nthTerm(n));
	}

	public static int nthTerm(int n){
		
		if(n==0 | n==1) return n;
		return nthTerm(n-1)+nthTerm(n-2);
	}
}