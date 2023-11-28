package com.optional;

import java.util.NoSuchElementException;
import java.util.Optional;

public class Optional4 {

	public static void main(String[] args) {

		String str1 = "Srinivas";
		Optional<String> myopts = Optional.ofNullable(str1);
		System.out.println("1. " + myopts);
		System.out.println("2. " + myopts.orElse("Hello Guys"));
		System.out.println("3. " + myopts.orElseGet(() -> "Ok Guys"));
		System.out.println("4. " + myopts.orElseThrow(NoSuchElementException::new));
		String str2 = null;
		myopts = Optional.ofNullable(str2);
		System.out.println("1. " + myopts);
		System.out.println("2. " + myopts.orElse("Hello Guys"));
		System.out.println("3. " + myopts.orElseGet(() -> "Ok Guys"));
		System.out.println("4. " + myopts.orElseThrow(NoSuchElementException::new));
	}
}
