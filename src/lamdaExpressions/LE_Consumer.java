package lamdaExpressions;

import java.util.function.Consumer;

public class LE_Consumer {

	static String name;

	static String gender;

	public static void main(String[] args) {

		Consumer<String> c=s->{
			String statictext="Name is:";
			name=statictext+" "+s;		
		};

		c.accept("Dhanapal");
		System.out.println(name);

		Consumer<String> c1=s->{
			String statictext="Gender is:";
			gender=statictext+" "+s;		
		};

		c1.accept("Male");
		System.out.println(gender);

		c.andThen(c1).accept("Dhanapal");
		System.out.println(name);
		System.out.println(gender);
	}
}
