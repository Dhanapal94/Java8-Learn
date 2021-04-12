package Streams;

import java.util.Arrays;
import java.util.List;

public class Streams_AnyMatch {

	public static void main(String[] args) {
		
		List<String> vehicles = Arrays.asList("Bus","Car","MotoBike","RoyalEnfield","Aeroplane","Car","Bus");
		System.out.println(vehicles);
		
		boolean matchFound = vehicles.stream().anyMatch(s->s.equalsIgnoreCase("motoBike"));
		System.out.println("Any Match Found:"+matchFound);
		
	}

}
