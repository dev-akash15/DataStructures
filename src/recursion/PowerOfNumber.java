package recursion;

import java.util.Scanner;

public class PowerOfNumber{

	public static void main(String[] s){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base number");
		int base = sc.nextInt();

		System.out.println("Enter the power");
		int power = sc.nextInt();		
		System.out.println(power(base,power));
	}

	public static int power(int base,int power){
		
		if(power==1) return base;
		if(power==0) return 1;

		return base*power(base,power-1);
	}

}