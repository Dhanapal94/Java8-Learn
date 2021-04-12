package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams_FlatMap {

	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(2,4,6,8,10);
		List<Integer> list2 = Arrays.asList(3,4,5,7,9,11);
		List<Integer> list3 = Arrays.asList(10,20,30,40,50,60);

		List<List<Integer>> finalList = Arrays.asList(list1,list2,list3);

		List<Integer> modifiedList =finalList.stream().flatMap(list->list.stream()).collect(Collectors.toList());
		System.out.println(modifiedList);
		
		List<Integer> mapFlatList = finalList.stream().flatMap(list->list.stream()).map(n->n*2).collect(Collectors.toList());
		System.out.println(mapFlatList);
		
		List<Integer> mapFlatOddList = finalList.stream().flatMap(list->list.stream()).filter(n->n%2!=0).collect(Collectors.toList());
		System.out.println(mapFlatOddList);
		
		List<Integer> mapFlatEvenList = finalList.stream().flatMap(list->list.stream()).filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(mapFlatEvenList);
	}

}
