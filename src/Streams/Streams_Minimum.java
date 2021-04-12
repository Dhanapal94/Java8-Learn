package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Streams_Minimum {
	
public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(13,4,5,0,10,45,1);
		System.out.println(numbers);
		
		Optional<Integer> minNumber = numbers.stream().min((value1,value2)->value1.compareTo(value2));
		System.out.println("Minimum Number:"+minNumber.get());
		
	}

}
