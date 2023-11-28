package com.lambda;

public class AddLambda2 {
public static void main(String[] args) {
	AddLambda al =(a,b)->{
		int sum=a+b;
		System.out.println("Sum "+sum);
	};
	
	al.sum(12, 18);
}
}

