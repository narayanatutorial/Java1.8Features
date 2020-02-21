package com.narayanatutorial.foreach;

import java.util.Arrays;
import java.util.List;

public class ListForEachExample {

	public static void main(String args[]) {
		// list
		System.out.println("**** normal for loop ****");
		List<Integer> list = Arrays.asList(5, 40, 20, 23, 40);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("**** foreach ****");
		for (Integer value : list) {
			System.out.println(value);
		}

		System.out.println("**** foreach lamda 1 ****");
		list.forEach(value -> System.out.println(value));

		System.out.println("**** foreach lamda 2 ****");
		list.forEach(System.out::println);

		System.out.println("**** foreach lamda + Stream 1 ****");
		list.stream().forEach(value -> System.out.println(value));

		System.out.println("**** foreach lamda + Stream 2 ****");
		list.stream().forEach(System.out::println);

		System.out.println("**** foreach lamda + Stream + filter 1 ****");
		list.stream().forEach(value -> {
			if (value.equals(5)) {
				System.out.println(value);
			}
		});

	}
}
