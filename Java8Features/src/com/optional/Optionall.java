package com.optional;

import java.util.Optional;

public class Optionall {
	public static void main(String[] args) {
//		 Optional<String> myopts1 = new Optional<String>();
		// Optional.empty() method
		Optional<String> myopts = Optional.empty();
		System.out.println("1. " + myopts);
		System.out.println("2. " + myopts.orElse("Hello Guys"));
		System.out.println("3. " + myopts);
		System.out.println("4. " + myopts.isPresent());
		// System.out.println("5. "+myopts.get());
		if (myopts.isPresent()) {
			System.out.println("5. " + myopts.get());
		} else {
			System.out.println("6. No value Found");
		}
	}
}
