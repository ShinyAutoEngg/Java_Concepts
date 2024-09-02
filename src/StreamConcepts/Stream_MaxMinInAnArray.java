package StreamConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;

public class Stream_MaxMinInAnArray 
{
	public static void main(String[] args) 
	{
		int[] a= {10,3,4,5,44,56};
		OptionalInt max=Arrays.stream(a).max();
		OptionalInt min = Arrays.stream(a).min();
		
		System.out.println(max);
		System.out.println(min);
		
		
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(5);
		al.add(6);
		al.add(9);
		al.add(1);
		al.add(3);
		Optional<Integer> maxNum = al.stream().max(Integer :: compareTo);
		System.out.println(maxNum);
	}
}
