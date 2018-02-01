package tester;

import lib.SimpleMath;

public class Test {

	public static void main(String[] args) {
		final int i = SimpleMath.parseInt("2147483648");

		System.out.println(i);
	}

}
