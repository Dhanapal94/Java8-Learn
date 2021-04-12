package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Streams_FindAny {
	
	public static void main(String[] args) {
		
	List<String> vehicles = Arrays.asList("Jeep","Car","MotoBike","RoyalEnfield","Aeroplane","Car","Bus");
	System.out.println(vehicles);
	
	Optional<String> findAny =vehicles.stream().filter(s->s.length()>9).findAny();
	System.out.println(findAny.get());
	
	
	
	
	}

}
