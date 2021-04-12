package lamdaExpressions;

import java.util.function.Function;

public class LE_Funtion {

	public static void main(String[] args) {
		
		Function<Integer,Integer> f = n->{
			if(n%2==0) {
				return 2;
			}
			else {
				return 1;
			}
		};
		
		System.out.println(f.apply(2));
		
		Function<Integer,Integer> f1 = n->{
			if(n%2==0) {
				return n*n;
			}
			else {
				return n*n*n;
			}
		};
		
		System.out.println(f.andThen(f1).apply(45));
		
		System.out.println(f.compose(f1).apply(1005));

	}

}
