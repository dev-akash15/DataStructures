
//2114. Maximum Number of Words Found in Sentences

/*A sentence is a list of words that are separated by a single space with no leading or trailing spaces.

You are given an array of strings sentences, where each sentences[i] represents a single sentence.

Return the maximum number of words that appear in a single sentence.*/

package leetcode_arrays;

public class MaxNoOfWordsInSent {

	public static void main(String[] args) {
		System.out.println((int)(Math.pow(2, 3)));
		MaxNoOfWordsInSent t = new MaxNoOfWordsInSent();
		String[] s = {"alice and bob love leetcode","i think so too",
				"this is great thanks very much"};
		System.out.println(t.mostWordsFound(s));
		
	}
	  public int mostWordsFound(String[] sentences) {
	        
	        int[] res = new int[sentences.length];
			
	        for(int i=0;i<sentences.length;i++) {
				
				String[] wordsInEachString = sentences[i].split(" ");
				res[i] = wordsInEachString.length;
			}
			return findMaxInArray(res);

		}
	    public static int findMaxInArray(int[] res) {
			int max =0;
			for(int i=0;i<res.length;i++) {
				if(res[i]>max) {
					max = res[i];
				}
			}
			return max;
		}
}
