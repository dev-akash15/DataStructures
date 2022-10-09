
// 412. Fizz Buzz

/*Given an integer n, return a string array answer (1-indexed) where:

answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
answer[i] == "Fizz" if i is divisible by 3.
answer[i] == "Buzz" if i is divisible by 5.
answer[i] == i (as a string) if none of the above conditions are true.
Example 1:

Input: n = 3
Output: ["1","2","Fizz"]

*/

package arrays;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	public static void main(String[] args) {
		FizzBuzz obj = new FizzBuzz();
		List<String> res = obj.fizzBuzz(15);
		res.forEach(i->System.out.print(i+ " "));
		
	}
	 public List<String> fizzBuzz(int n) {
	        List<String> result = new ArrayList<>();
	        for(int i=1;i<=n;i++) 
		        {
		        	if(i%3==0 && i%5==0)
			        {
			            result.add(i-1,"FizzBuzz");
			        }
			        else if(i%3==0 && i%5!=0)
			        {
			            result.add(i-1,"Fizz");
			        }
			        else if(i%3!=0 && i%5==0)
			        {
			            result.add(i-1,"Buzz");
			        }
			        else
			        {
			            result.add(i-1, String.valueOf(i));
			        }
		        }
		        return result;
	    }
}
