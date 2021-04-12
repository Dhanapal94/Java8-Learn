package Streams;

import java.util.ArrayList;
import java.util.List;

public class Streams_AllMatch {
	
public static void main(String[] args) {
		
		List<String> fruitsDescription = new ArrayList<String>();
		fruitsDescription.add("One Apple");
		fruitsDescription.add("One Mango");
		fruitsDescription.add("One Orange");
		fruitsDescription.add("One Grapes");
		System.out.println(fruitsDescription);
		
		boolean allMatchFound = fruitsDescription.stream().allMatch(s->s.startsWith("One"));
		System.out.println("All Match Found:"+allMatchFound);
		
		fruitsDescription.add(2, "Two Oranges");
		System.out.println(fruitsDescription);
		
		boolean allMatchFound1 = fruitsDescription.stream().allMatch(s->s.startsWith("One"));
		System.out.println("All Match Found after Modify:"+allMatchFound1);
		
	}

}
