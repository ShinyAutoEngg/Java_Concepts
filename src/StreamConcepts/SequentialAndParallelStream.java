package StreamConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SequentialAndParallelStream 
{
	public static void main(String[] args)
	{
		List<String> slist = new ArrayList<>();
		slist.add("shiny");
		slist.add("hello");
		slist.add("Ayaan");
		System.out.println(slist);
		Stream<String> seqStream = slist.stream();
		seqStream.forEach(System.out::println);
		Stream<String> parStream = slist.parallelStream();
		parStream.forEach(System.out::println);
		
		List<String> al = Arrays.asList("sindhu","cauvery","yamuna","Godavari");
		System.out.println(al);
		System.out.println(al.get(2));
		
		
	}
}
