package com.optional;

import java.util.Optional;

public class Optionall2 {
	public static void main(String[] args) {
		//Optional.of() method
		String str ="Srinivas";
		Optional<String> myopts= Optional.of(str);
		System.out.println("1. "+myopts);
		System.out.println("2. "+myopts.orElse("Hello Guys"));
		System.out.println("3. "+myopts);
		System.out.println("4. "+myopts.isPresent());
		//System.out.println("5. "+myopts.get());
		if(myopts.isPresent()) {
		System.out.println("5. "+myopts.get());
		}else {
		System.out.println("6. No value Found");
		}
		
		String strr =null;
		Optional<String> myopts1= Optional.ofNullable(strr);
		System.out.println("1. "+myopts1);
		System.out.println("2. "+myopts1.orElse("Hello Guys"));
		System.out.println("3. "+myopts1);
		System.out.println("4. "+myopts1.isPresent());
		//System.out.println("5. "+myopts.get());
		if(myopts1.isPresent()) {
		System.out.println("5. "+myopts1.get());
		}else {
		System.out.println("6. No value Found");
		}
		}
}
