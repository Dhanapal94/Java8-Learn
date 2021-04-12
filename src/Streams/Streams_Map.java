package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams_Map {

	public static void main(String[] args) {
		
		List<Integer> num = Arrays.asList(12,10,30,45,52,59);
		
		List<Integer> modified = num.stream().map(n->n+2).collect(Collectors.toList());
		
		System.out.println(modified);
		
		//Consumer
		
		num.stream().map(n->n+2).forEach(n->System.out.print(n+","));
		
		Long count = num.stream().map(n->n+3).count();
		System.out.println(count);
		
		

	}

}
