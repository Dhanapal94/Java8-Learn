package lamdaExpressions;

import java.util.function.Predicate;

public class LambdaExpression_Predicate {

	public static void main(String[] args) {

		Predicate<Integer> p1 = num->num>=100;
		System.out.println(p1.test(50));
		
		Predicate<Integer> p2 = LE_Predicate_Static_MethodRefrence::booleanCheck;
		System.out.println(p2.test(105));
		
		System.out.println(p1.and(p2).test(100));
		
		System.out.println(p1.negate().test(50));
		
		System.out.println(p1.or(p2).test(101));
	}

}
