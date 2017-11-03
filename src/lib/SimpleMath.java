package lib;

public class SimpleMath {

	public static long factorial(byte num) {
		long prod = 1;
		if ((num < 0) || (num > 20)) {
			throw new IllegalArgumentException("It can't be less than 0 or bigger than 20 you furpus.");
		} else {
			for (int i = 2; i <= num; i++) {
				prod *= i;
			}
			return prod;
		}
	}
}
