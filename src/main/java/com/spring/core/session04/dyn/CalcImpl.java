package com.spring.core.session04.dyn;

public class CalcImpl implements Calc {

	@Override
	public int add(int x, int y) {
		//System.out.println("Log: ....");
		int result = x + y;
		return result;
	}

	@Override
	public int div(int x, int y) {
		//System.out.println("Log: ....");
		int result = x / y;
		return result;
	}

}
