package com.baidu.test;

public class TestMianShi {
	public static void test(String str) {
		str = "hello";
	}
	public static void main(String[] args) {
		String string = "beijing";
		test(string);
		System.err.println(string);
		long round = Math.round(11.5);
		long round2 = Math.round(-11.5);
		System.err.println(round);
		System.err.println(round2);
		Integer a = 125;
		Integer b = 125;
		System.err.println(a == b);
	}
}