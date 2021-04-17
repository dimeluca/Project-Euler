// https://projecteuler.net/problem=2

import java.util.ArrayList;

public class Problem2 {
	
public static void main(String[] args) {
		
	System.out.println(fibonacciEvenSum());
	
}

private static int fibonacciEvenSum() {
	
	ArrayList<Integer> fibNum = new ArrayList<>();
	fibNum.add(0);
	fibNum.add(1);
	int sum = 0;
	
	for (int i = 2; i < 4000000; i++) {
		fibNum.add((fibNum.get(i - 1)) + (fibNum.get(i - 2)));
		if((fibNum.get(i) < 4000000)) {
			if(fibNum.get(i) % 2 == 0)
				sum = sum + fibNum.get(i);
		}else {
			break;
		}
	}
	
	return sum;	
		
}

}
