package recursion;

public class PrintNumbers{


	public static void main(String[] s)
	{
		System.out.println("Print Decreasing");
		PD(5);
		System.out.println();
		System.out.println("Print Increasing");
		PI(5);
		System.out.println();

		System.out.println("Print Decrasing and Increasing");
		PDI(5);
		System.out.println();
		
		System.out.println("Print Decreasing odd and increasing even");
		PDISkip(5);
		System.out.println();
	}

	public static void PD(int n)
	{
		if(n==0) return;
		System.out.print(n+" ");
		PD(n-1);
	}

	public static void PI(int  n)
	{
		if(n==0) return;
		PI(n-1);
		System.out.print(n+" ");
	}

	public static void PDI(int n)
	{
		if(n==0) return;
		System.out.print(n+" ");
		PDI(n-1);
		System.out.print(n+" ");
	}

	public static void PDISkip(int n)
	{
		if(n==0) 
		{
			return;
		}
		
		if(n%2!=0) 
		{
			System.out.print(n+" ");
		}
		
		PDISkip(n-1);
		
		if(n%2==0) 
		{
			System.out.print(n+" ");
		}
	}

}