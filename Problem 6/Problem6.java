// https://projecteuler.net/problem=6


public class Problem6 {

public static void main(String[] args) {
		
		System.out.println(sumSquareDiff());
		
	}

private static int sumSquareDiff() {
	
	int sumSquares = 0;
	int squareSum = 0;
	
	for(int i = 1; i <= 100; i++) {
		sumSquares = (int) (sumSquares + Math.pow(i, 2));
	}
	
	for(int i = 1; i <= 100; i++) {
		squareSum = squareSum + i;
	}
	
	return (int) Math.pow(squareSum, 2) - sumSquares;
	
	
}
	
}
