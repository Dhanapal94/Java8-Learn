package Streams;

import java.util.ArrayList;
import java.util.List;

public class Streams_NoneMatch {

	public static void main(String[] args) {
		
		List<String> fruitsDescription = new ArrayList<String>();
		fruitsDescription.add("One Apple");
		fruitsDescription.add("One Mango");
		fruitsDescription.add("One Orange");
		fruitsDescription.add("One Grapes");
		System.out.println(fruitsDescription);
		
		
		boolean noneMatchFlag=fruitsDescription.stream().noneMatch(s->s.startsWith("Two"));
		System.out.println("None Match Found:"+noneMatchFlag);
		
		fruitsDescription.add(2, "Two Oranges");
		System.out.println(fruitsDescription);
		
		boolean NoneMatchFlag1 = fruitsDescription.stream().allMatch(s->s.startsWith("Two"));
		System.out.println("None Match Found after Modify:"+NoneMatchFlag1);
	}

}
