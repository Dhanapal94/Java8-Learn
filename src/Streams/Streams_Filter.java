package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams_Filter {

	public static void main(String[] args) {

		List<Integer> num = Arrays.asList(12,10,30,45,52,59);
		
		List<Integer> even = new ArrayList<Integer>();
		List<Integer> odd = new ArrayList<Integer>();
		
		even = num.stream().filter(n->n%2==0).collect(Collectors.toList()); //Filter Predicate SAM
		odd = num.stream().filter(n->n%2!=0).collect(Collectors.toList());
		
		System.out.println("Odd Numbers: "+odd); 
		System.out.println("Even Numbers: "+even);
		
		num.stream().filter(n->n%2!=0).forEach(n->System.out.print(n+","));// Foreach Consumer SAM
		System.out.println();
		num.stream().filter(n->n%2==0).forEach(System.out::print);
		 

	}

}
