import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {

	    private int getNext(int n) {
	        int totalSum = 0;
	        while (n > 0) {
	            int d = n % 10;
	            n = n / 10;
	            totalSum += d * d;
	        }
	        return totalSum;
	    }

	    public boolean isHappy(int n) {
//	        Set<Integer> seen = new HashSet<>();
//	        while (n != 1 && !seen.contains(n)) {
//	            seen.add(n);
//	            n = getNext(n);
//	        }
//	        return n == 1;
	    	int slowRunner = n;
	    	int fastRunner = getNext(n);
	    	while (fastRunner != 1 && slowRunner != fastRunner) {
	    		slowRunner = getNext(slowRunner);
	    		fastRunner = getNext(getNext(fastRunner));
	    	}
	    	return fastRunner == 1;
	    }
	    
	    public static void main(String[] args) {
	    	int n = Integer.parseInt(args[0]);
	    	Solution solution = new Solution();
//	    	System.out.println(solution.isHappy(n));
	    	Integer a[] = new Integer[] { 10, 20, 30, 40 };
	    	for (int ab : a) {
	    		System.out.println(ab);
	    	}
	    	System.out.println(Arrays.asList(a));
	    	
	    }
}
