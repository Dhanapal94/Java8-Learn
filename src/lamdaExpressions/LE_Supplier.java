package lamdaExpressions;

import java.util.function.Supplier;

public class LE_Supplier {

	public static void main(String[] args) {
		Supplier<Integer> s = ()->1;
		System.out.println(s.get());
	}

}
