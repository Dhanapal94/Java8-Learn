package lamdaExpressions;

import java.util.function.Predicate;

public class LE_Predicate_Static_MethodRefrence {

	public static boolean booleanCheck(int number) {

		if(number%10==0) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		
		Predicate<Integer> p= LE_Predicate_Static_MethodRefrence::booleanCheck;
		System.out.println(p.test(100));
		
	}


}
