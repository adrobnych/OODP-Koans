package com.tdl.combats.proxy_vs_adapter;

interface Calc{
	int plus(int a, int b);
	
	int minus(int a, int b);
	
	int multiply(int a, int b);
	
	int devide(int a, int b);
}

class ExtCalc implements Calc{
	public int plus(int a, int b){
		return a+b;
	}
	
	public int minus(int a, int b){
		return a-b;
	}
	
	public int multiply(int a, int b){
		return a*b;
	}
	
	public int devide(int a, int b){
		return a/b;
	}
}

class ProxyCalc implements Calc{
	
	private Calc ec;
	
	ProxyCalc(Calc extCalc){
		this.ec = extCalc;
	}
	
	public int plus(int a, int b){
		return ec.plus(a, b);
	}
	
	public int minus(int a, int b){
		return ec.minus(a, b);
	}
	
	public int multiply(int a, int b){
		return ec.multiply(a, b);
	}
	
	public int devide(int a, int b){
		if(b != 0)
			return ec.devide(a, b);
		else{
			System.out.println("unsupported operation");
			return -1;
		}
	}
}

public class ExternalCalculator {

	public static void main(String[] args) {

		Calc calc = new ProxyCalc(new ExtCalc());
		
		System.out.println(calc.devide(2, 0));

	}

}
