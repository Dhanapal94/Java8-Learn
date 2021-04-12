package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Streams_FindFirst {

	public static void main(String[] args) {
	
		List<String> vehicles = Arrays.asList("Jeep","Car","MotoBike","RoyalEnfield","Aeroplane","Car","Bus");
		System.out.println(vehicles);
		
		Optional<String> findFirst =vehicles.stream().findFirst();
		System.out.println(findFirst.get());

	}

}
