package com.optional;

import java.util.Optional;

public class Optional3 {

	public static void main(String[] args) {
		String str1 = "Srinivas";
		Optional<Optional<String>> myopts1 = Optional.of(Optional.ofNullable(str1));
		System.out.println("1. " + myopts1);
		System.out.println("2. " + myopts1.map(input -> input));
		System.out.println("3. " + myopts1.flatMap(input -> input));
		System.out.println("------------");
		Optional<Optional<String>> x = myopts1.map(input1 -> input1.map(input2 -> input2.toUpperCase()));
		System.out.println("x = " + x);
		Optional<String> y = myopts1.flatMap(input1 -> input1.map(input2 -> input2.toUpperCase()));
		System.out.println("y = " + y);
		System.out.println("------------");
		String str2 = "jlc";
		Optional<Optional<Optional<String>>> myopts2 = Optional.of(Optional.of(Optional.ofNullable(str2)));
		Optional<Optional<Optional<String>>> aa = myopts2.map(input1 -> input1);
		System.out.println(aa);
		System.out.println("Done!!!");
	}
}
