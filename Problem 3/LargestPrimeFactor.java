// https://projecteuler.net/problem=3

import java.util.ArrayList;

public class LargestPrimeFactor {
	
	public static void main(String[] args) {
		
		System.out.println(largestPrimeF(600851475143L));
		
	}

	private static int largestPrimeF(long num) {
		
		ArrayList<Integer> factors = new ArrayList<>();
		
		if(num % 2 == 0)
			factors.add(2);
		
		for(int i = 3; i <= num; i = i + 2) {
			if(num % i == 0) {
				factors.add(i);
				num = num / i;
			}
		}
				
		return factors.get(factors.size() - 1);
	}


}
