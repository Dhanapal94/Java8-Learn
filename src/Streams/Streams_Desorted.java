package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Streams_Desorted {

	public static void main(String[] args) {
		
		List<String> vehicles = Arrays.asList("Bus","Car","MotoBike","RoyalEnfield","Aeroplane","Car","Bus");
		System.out.println("BeforeSorting:"+vehicles);
		
		List<String> deSortingVehicles =vehicles.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("Descending Order Sorting:"+deSortingVehicles);

	}

}
