package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams_Limit {
	
public static void main(String[] args) {
		
		List<String> vehicles = Arrays.asList("Bus","Car","MotoBike","RoyalEnfield","Aeroplane","Car","Bus");
		System.out.println(vehicles);
		
		List<String> limitVehicles = vehicles.stream().limit(3).collect(Collectors.toList());
		System.out.println(limitVehicles);
					
	}

}
