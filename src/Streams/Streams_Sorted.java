package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams_Sorted {
	public static void main(String[] args) {

		List<String> vehicles = Arrays.asList("Bus","Car","MotoBike","RoyalEnfield","Aeroplane","Car","Bus");
		System.out.println("BeforeSorting"+vehicles);
		
		List<String> sortedVehicles =vehicles.stream().sorted().collect(Collectors.toList());
		System.out.println("AfterSorting:"+sortedVehicles);
		
	}
}
