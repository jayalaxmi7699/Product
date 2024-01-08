package com.myoptional;

import java.util.Optional;

public class App1 
{
	@SuppressWarnings("null")
	public static void main(String[] args)  {
		String str = null;

		// int length = str.length(); // gives exception
		//Optional<String> string= Optional.of(str);  // gives exception
		
		Optional<String> string = Optional.ofNullable(str);
		//if(! string.isEmpty())
		if(string.isPresent())
		{
			System.out.println(string.get().length());
		}
		else
		{
			System.out.println("String is null");
		}
		
		
		try {
			//Optional optional =Optional.empty();
			Optional optional =Optional.of(str);
			String str2 = (String) (optional.orElseThrow(()->new Exception("Getting exception..")));
			System.out.println(str2);

		} catch (Throwable e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
