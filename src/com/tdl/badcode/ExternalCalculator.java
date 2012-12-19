package com.tdl.badcode;

class Calc{
	int plus(int a, int b){
		return a+b;
	}
	
	int minus(int a, int b){
		return a-b;
	}
	
	int multiply(int a, int b){
		return a*b;
	}
	
	int devide(int a, int b){
		return a/b;
	}
}

public class ExternalCalculator {

	public static void main(String[] args) {

		Calc calc = new Calc();
		
		System.out.println(calc.devide(2, 0));

	}

}
