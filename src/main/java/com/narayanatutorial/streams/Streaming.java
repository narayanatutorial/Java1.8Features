package com.narayanatutorial.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Streaming {

	public static void main(String args[]) {
		int[] arr = { 5, 40, 20, 23, 40 };

		List<Integer> list = new ArrayList<Integer>(arr.length);
		for (int i : arr) {
			list.add(Integer.valueOf(i));
		}

		// sort using stream
		System.out.println("**** Sorting using stream ****");
		List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
		sortedList.forEach(value -> System.out.println(value));

		// count using stream
		System.out.println("**** count using stream ****");
		long count = list.stream().count();
		System.out.println(count);

		// distinct using stream
		System.out.println("**** distinct using stream ****");
		list.stream().distinct().forEach(value -> System.out.println(value));

		// create set using stream
		System.out.println("**** create set using stream ****");
		Set<Integer> set = list.stream().collect(Collectors.toSet());
		set.stream().forEach(value -> System.out.println(value));

		// find first element using stream
		System.out.println("**** find first element using stream ****");
		int first = list.stream().findFirst().get();
		System.out.println(first);

		// Filter List using stream
		System.out.println("**** Filter List using stream ****");
		List<Integer> filterList = list.stream().filter(value -> value.equals(5)).collect(Collectors.toList());
		filterList.stream().forEach(value -> System.out.println(value));

		// Filter and stream
		System.out.println("**** Filter and stream ****");
		list.stream().filter(value -> value.equals(5)).forEach(value->System.out.println(value));
		
		//different way of print
		System.out.println("Filter and stream and print different way");
		list.stream().filter(value -> value.equals(5)).forEach(System.out::println);
		
	}

}
