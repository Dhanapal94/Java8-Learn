package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams_Distinct {

	public static void main(String[] args) {
		
		List<String> vehicles = Arrays.asList("Bus","Car","MotoBike","RoyalEnfield","Aeroplane","Car","Bus");
		System.out.println(vehicles);
		
		List<String> distinctVehicles = vehicles.stream().distinct().collect(Collectors.toList());
		System.out.println(distinctVehicles);
				
	}

}
