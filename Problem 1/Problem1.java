// https://projecteuler.net/problem=1

public class Problem1 {
	
public static void main(String[] args) {
		
	System.out.println(multSum());
	
}

private static int multSum() {
	
	int sum = 0;
	
	for (int i = 1; i < 1000; i++) {
		if((i % 3 == 0) || (i % 5 == 0)) {
			sum = sum + i;
		}
	}
	
	return sum;	
		
}

}