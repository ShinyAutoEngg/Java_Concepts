package StreamConcepts;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Stream_CreateAStreamFromArray
{
	public static void main(String[] args) 
	{
		int[] a= {3,5,7,9,10,1};
		IntStream arr = Arrays.stream(a);
		Arrays.stream(a).forEach(System.out ::println);
		System.out.println("===================================");
		Arrays.stream(a).forEachOrdered(System.out::println);
	}
}
