package Streams;

import java.util.Arrays;
import java.util.List;

public class Streams_ToArray {


	public static void main(String[] args) {

		List<String> vehicles = Arrays.asList("Bus","Car","MotoBike","RoyalEnfield","Aeroplane","Car","Bus");
		System.out.println(vehicles);

		Object[] arrayVehicles= vehicles.stream().toArray();

		for(int i=0;i<arrayVehicles.length;i++) {
			System.out.println(arrayVehicles[i]);
		}


	}

}
