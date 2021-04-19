// https://projecteuler.net/problem=16

import java.math.BigInteger;

public class Problem16 {
	
public static void main(String[] args) {
		
		System.out.println(digitsSum());
		
	}

private static int digitsSum() {
	
	int sum = 0;
	BigInteger num = new BigInteger("2");
	num = num.pow(1000);
	
	for(int i = 0; i < num.toString().length(); i++) {
		sum = sum + Integer.valueOf(String.valueOf(num.toString().charAt(i)));
	}
	
	return sum;
}

}
